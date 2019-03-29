/* 
 * 文件名：UseResidentVo.java  
 * 版权：Copyright 2016-2017 炎宝网络科技  All Rights Reserved by
 * 修改人：邱深友  
 * 创建时间：2017年7月18日
 * 版本号：v1.0
*/
package com.qzi.cms.common.vo;

import com.qzi.cms.common.po.UseResidentCardPo;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

/**
 * 住户信息VO类
 * @author qsy
 * @version v1.0
 * @date 2017年7月18日
 */
public class UseResidentVo {
	/**
	 * 主键编号
	 */
	private String id;
	/**
	 * 姓名
	 */
	private String name;

	private String salt;

	/**
	 * 手机号
	 */
	private String mobile;
	/**
	 * 登录密码
	 */
	private String password;
	/**
	 * 小区编号
	 */
	private String communityId;
	/**
	 * 小区名称
	 */
	private String communityName;
	/**
	 * 云之讯clientNumber
	 */
	private String clientNumber;
	/**
	 * 云之讯密码
	 */
	private String clientPwd;
	/**
	 * 第三方token
	 */
	private String loginToken;
	/**
	 * 开门密码
	 */
	private String openPwd;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 状态
	 */
	private String state;
	/**
	 * 手机短信验证码
	 */
	private String smsCode;


	private String  buildingId;
	private String utilName;
	private String roomName;


	private String remark;
	private String unitId;


	/**
	 * 原密码
	 */
	private String oldPwd;


	/**
	 * 是否默认小区
	 */
	private String  isTrue;



	/**
	 * 微信
	 */
	private String wxId;
	/**
	 * 人脸识别
	 */
	private String imgUrl;
	/**
	 * 指纹id
	 */
	private String fingerUrl;

	/**
	 * 身份证id
	 */
	private String identityId;

	/**
	 * 身份证No
	 */
	private String identityNo;


	/**
	 * 生效时间
	 */
	private Date lastTime;

	/**
	 * 访客类型
	 */
	private String residentType;


	private  String equipmentNo;

	private String cmd;

	private String deviceId;


	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getEquipmentNo() {
		return equipmentNo;
	}

	public void setEquipmentNo(String equipmentNo) {
		this.equipmentNo = equipmentNo;
	}

	public String getCmd() {
		return cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}

	private List<String> cardPos;

	public List<String> getCardPos() {
		return cardPos;
	}

	public void setCardPos(List<String> cardPos) {
		this.cardPos = cardPos;
	}

	public String getResidentType() {
		return residentType;
	}

	public void setResidentType(String residentType) {
		this.residentType = residentType;
	}

	public Date getLastTime() {
		return lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	public String getWxId() {
		return wxId;
	}

	public void setWxId(String wxId) {
		this.wxId = wxId;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getFingerUrl() {
		return fingerUrl;
	}

	public void setFingerUrl(String fingerUrl) {
		this.fingerUrl = fingerUrl;
	}

	public String getIdentityId() {
		return identityId;
	}

	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}

	public String getIdentityNo() {
		return identityNo;
	}

	public void setIdentityNo(String identityNo) {
		this.identityNo = identityNo;
	}

	public String getIsTrue() {
		return isTrue;
	}

	public void setIsTrue(String isTrue) {
		this.isTrue = isTrue;
	}

	public String getOldPwd() {
		return oldPwd;
	}

	public void setOldPwd(String oldPwd) {
		this.oldPwd = oldPwd;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getUnitId() {
		return unitId;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}

	public String getUtilName() {
		return utilName;
	}

	public void setUtilName(String utilName) {
		this.utilName = utilName;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	/**
	 * @return the loginToken
	 */
	public String getLoginToken() {
		return loginToken;
	}
	/**
	 * @param loginToken the loginToken to set
	 */
	public void setLoginToken(String loginToken) {
		this.loginToken = loginToken;
	}
	/**
	 * @return the smsCode
	 */
	public String getSmsCode() {
		return smsCode;
	}
	/**
	 * @param smsCode the smsCode to set
	 */
	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the openPwd
	 */
	public String getOpenPwd() {
		return openPwd;
	}
	/**
	 * @param openPwd the openPwd to set
	 */
	public void setOpenPwd(String openPwd) {
		this.openPwd = openPwd;
	}
	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the communityId
	 */
	public String getCommunityId() {
		return communityId;
	}
	/**
	 * @param communityId the communityId to set
	 */
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}
	/**
	 * @return the communityName
	 */
	public String getCommunityName() {
		return communityName;
	}
	/**
	 * @param communityName the communityName to set
	 */
	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}
	/**
	 * @return the clientNumber
	 */
	public String getClientNumber() {
		return clientNumber;
	}
	/**
	 * @param clientNumber the clientNumber to set
	 */
	public void setClientNumber(String clientNumber) {
		this.clientNumber = clientNumber;
	}
	/**
	 * @return the clientPwd
	 */
	public String getClientPwd() {
		return clientPwd;
	}
	/**
	 * @param clientPwd the clientPwd to set
	 */
	public void setClientPwd(String clientPwd) {
		this.clientPwd = clientPwd;
	}
}
