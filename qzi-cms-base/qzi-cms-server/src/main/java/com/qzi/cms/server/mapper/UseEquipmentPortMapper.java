/* 
 * 文件名：UseRoomMapper.java  
 * 版权：Copyright 2016-2017 炎宝网络科技  All Rights Reserved by
 * 修改人：邱深友  
 * 创建时间：2017年7月6日
 * 版本号：v1.0
*/
package com.qzi.cms.server.mapper;

import com.qzi.cms.common.po.UseEquipmentNowStatePo;
import com.qzi.cms.common.po.UseEquipmentPortPo;
import com.qzi.cms.server.base.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * 用户端口列表
 * @author qsy
 * @version v1.0
 * @date 2017年7月6日
 */
public interface UseEquipmentPortMapper extends BaseMapper<UseEquipmentPortPo>{

	@Update("update use_equipment_port set ips=#{ips},port=#{port},createTime = now()  where equipmentNo=#{equipmentNo}")
	public void update(@Param("ips") String ips,@Param("port") String port,@Param("equipmentNo") String equipmentNo);

	@Select("select * from use_equipment_port where equipmentNo=#{equipmentNo} ")
	public UseEquipmentPortPo findOne(@Param("equipmentNo") String equipmentNo);


}