/* 
 * 文件名：UseResidentMessageMapper.java  
 * 版权：Copyright 2016-2017 炎宝网络科技  All Rights Reserved by
 * 修改人：邱深友  
 * 创建时间：2017年8月2日
 * 版本号：v1.0
*/
package com.qzi.cms.server.mapper;

import com.qzi.cms.common.po.UseResidentMessagePo;
import com.qzi.cms.common.po.UseResidentUnlockRecordPo;
import com.qzi.cms.common.vo.UseResidentUnlockRecordVo;
import com.qzi.cms.server.base.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 用户开锁记录
 * @author qsy
 * @version v1.0
 * @date 2017年8月2日
 */
public interface UseResidentUnlockRecordMapper extends BaseMapper<UseResidentUnlockRecordPo>{



	@Select("select * from use_resident_unlockRecord where wxid = #{wxId}")
	public List<UseResidentUnlockRecordVo> findAll(@Param("wxId") String wxId);

	@Select("select * from use_resident_unlockRecord where deviceId = #{deviceId} limit 1")
	public UseResidentUnlockRecordPo deviceId(@Param("deviceId") String deviceId);





}
