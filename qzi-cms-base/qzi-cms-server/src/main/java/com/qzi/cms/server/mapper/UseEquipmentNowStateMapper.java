/* 
 * 文件名：UseRoomMapper.java  
 * 版权：Copyright 2016-2017 炎宝网络科技  All Rights Reserved by
 * 修改人：邱深友  
 * 创建时间：2017年7月6日
 * 版本号：v1.0
*/
package com.qzi.cms.server.mapper;

import com.qzi.cms.common.po.UseEquipmentNowStatePo;
import com.qzi.cms.common.po.UseResidentCardPo;
import com.qzi.cms.server.base.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 用户房卡列表
 * @author qsy
 * @version v1.0
 * @date 2017年7月6日
 */
public interface UseEquipmentNowStateMapper extends BaseMapper<UseEquipmentNowStatePo>{





	@Update("update use_equipment_nowState set state=#{state},updateTime = now()  where equipmentId=#{id}")
	public void update(@Param("state") String state,@Param("id") String id);


	@Select("select * from use_equipment_nowState where equipmentNo=#{equipmentNo}")
	public UseEquipmentNowStatePo findOne(@Param("equipmentNo") String equipmentNo);
}