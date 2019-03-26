package com.qzi.cms.common.po;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Administrator on 2019/3/14.
 */



@Table(name="use_resident_equipment")
public class UseResidentEquipmentPo {
    /**
     * 主键编号
     */
    @Id
    private String id;

    private String residentId;

    private String communityId;

    private String equipmentId;

    private String state;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResidentId() {
        return residentId;
    }

    public void setResidentId(String residentId) {
        this.residentId = residentId;
    }

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
