/* 
 * 文件名：UseResidentRoomMapper.java  
 * 版权：Copyright 2016-2017 炎宝网络科技  All Rights Reserved by
 * 修改人：邱深友  
 * 创建时间：2017年7月22日
 * 版本号：v1.0
*/
package com.qzi.cms.server.mapper;

import com.qzi.cms.common.po.UseEquipmentPo;
import com.qzi.cms.common.po.UseResidentEquipmentPo;
import com.qzi.cms.common.po.UseResidentRoomPo;
import com.qzi.cms.common.vo.UseEquipmentVo;
import com.qzi.cms.common.vo.UseResidentRoomVo;
import com.qzi.cms.common.vo.UseResidentVo;
import com.qzi.cms.server.base.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 用户设备表
 * @author zyc
 * @version v1.0
 * @date 2017年7月22日
 */
public interface UseResidentEquipmentMapper extends BaseMapper<UseResidentEquipmentPo>{

	@Delete("delete from  use_resident_equipment where residentid = #{residentid} and communityId = #{communityId}")
	public void deleteResident(@Param("residentid") String residentid,@Param("communityId") String communityId);


	@Select("select *  from  use_resident_equipment where residentid = #{residentid} and communityId = #{communityId}")
	public List<UseResidentEquipmentPo> findResident(@Param("residentid") String residentid, @Param("communityId") String communityId);



	@Select("select *  from  use_resident_equipment where residentid = #{residentid}")
	public List<UseResidentEquipmentPo> findResidentState(@Param("residentid") String residentid);



	@Select("select count(1)  from  use_resident_equipment where residentid = #{residentid}")
	public Integer findResidentStateCount(@Param("residentid") String residentid);



	@Select("select r.* from use_resident_equipment e left join use_resident r on r.id = e.residentId  where r.state ='10' and  e.equipmentId =(select id from use_equipment where  equNo = #{equipmentNo} limit 1)")
	public  List<UseResidentVo> findResidentId(@Param("equipmentNo") String equipmentNo);



	@Select("select e.*,TIMESTAMPDIFF(SECOND,p.createTime,now()) as lastTime from use_equipment e left join use_equipment_port p on e.equNo = p.equipmentNo  where e.id in  (select equipmentId from use_resident_equipment where residentId = (select id  from use_resident where wxid=#{wxid})) ")
	public List<UseEquipmentVo> findWxId(@Param("wxid") String wxid);






}
