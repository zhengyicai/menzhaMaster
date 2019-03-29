/* 
 * 文件名：UseResidentMessageMapper.java  
 * 版权：Copyright 2016-2017 炎宝网络科技  All Rights Reserved by
 * 修改人：邱深友  
 * 创建时间：2017年8月2日
 * 版本号：v1.0
*/
package com.qzi.cms.server.mapper;

import com.qzi.cms.common.po.UseResidentUnlockRecordPo;
import com.qzi.cms.common.po.UseUnlockEquRecordPo;
import com.qzi.cms.common.vo.UseResidentUnlockRecordVo;
import com.qzi.cms.common.vo.UseResidentVo;
import com.qzi.cms.common.vo.UseUnlockEquRecordVo;
import com.qzi.cms.server.base.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 用户开锁记录
 * @author qsy
 * @version v1.0
 * @date 2017年8月2日
 */
public interface UseUnlockEquRecordMapper extends BaseMapper<UseUnlockEquRecordPo>{



//	@Select("select * from use_resident_unlockRecord where wxid = #{wxId}")
//	public List<UseResidentUnlockRecordVo> findAll(@Param("wxId") String wxId);
//
//	@Select("select * from use_resident_unlockRecord where deviceId = #{deviceId} limit 1")
//	public UseResidentUnlockRecordPo deviceId(@Param("deviceId") String deviceId);
    //@Select("select r.*,u.mobile,u.name,e.communityId as communityId,c.communityName from use_unlock_equRecord r left join use_resident u on u.wxId = r.wxId left join use_equipment e on e.equno =r.equipmentNo  left join use_community c on c.id = communityId")
    //public List<UseUnlockEquRecordVo> findAll();


    //@Select("select r.*,u.mobile,u.name,e.communityId as communityId,c.communityName from use_unlock_equRecord r left join use_resident u on u.wxId = r.wxId left join use_equipment e on e.equno =r.equipmentNo  left join use_community c on c.id = communityId where communityId=#{communityId}")
    //public List<UseUnlockEquRecordVo> findCommunityId(@Param("communityId") String communityId);


    public List<UseUnlockEquRecordVo> findAll(RowBounds rwoBounds, @Param("communityId") String communityId);
    public Integer findcound( @Param("communityId") String communityId);





}
