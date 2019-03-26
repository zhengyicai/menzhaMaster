/* 
 * 文件名：UseRoomMapper.java  
 * 版权：Copyright 2016-2017 炎宝网络科技  All Rights Reserved by
 * 修改人：邱深友  
 * 创建时间：2017年7月6日
 * 版本号：v1.0
*/
package com.qzi.cms.server.mapper;

import com.qzi.cms.common.po.UseResidentCardPo;
import com.qzi.cms.common.po.UseUserCardPo;
import com.qzi.cms.common.vo.UseUserCardVo;
import com.qzi.cms.server.base.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 用户房卡列表
 * @author qsy
 * @version v1.0
 * @date 2017年7月6日
 */
public interface UseResidentCardMapper extends BaseMapper<UseResidentCardPo>{

	@Select("select * from use_resident_card  where residentId = #{resident} order by id")
	public List<UseResidentCardPo> findResidentId(RowBounds rwoBounds, @Param("resident") String resident);


	@Select("select * from use_resident_card  where residentId = #{resident} order by id")
	public List<UseResidentCardPo> findResidentIds(@Param("resident") String resident);


	@Select("select cardNo from use_resident_card  where residentId = #{resident} order by id")
	public List<String> findResidentCardNoIds(@Param("resident") String resident);

	@Select("select count(1) from use_resident_card  where residentId = #{resident}")
	public Integer findCountResidentId(@Param("resident") String resident);


	@Delete("delete from use_resident_card  where residentId=#{resident}")
	public void deleteResidentId(@Param("resident") String resident);

}