package com.cloud.organization.model;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lgh
 * @since 2019-04-25
 */
public class CloudOrgModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "org_id", type = IdType.AUTO)
    private Integer orgId;

    /**
     * 组织名称
     */
    private String orgName;

    /**
     * 上级代码ID
     */
    private Integer orgParentId;

    /**
     * 路径
     */
    private String orgPath;

    /**
     * 上级简称ID
     */
    private Integer orgShortId;

    /**
     * 上级简称名称
     */
    private String orgShortName;

    /**
     * 状态 1.有效2.无效
     */
    private Integer orgState;

    /**
     * 创建时间
     */
    private Date orgCreateDate;

    /**
     * 修改时间
     */
    private Date orgUpdateDate;

    /**
     * 组织代码
     */
    private String orgCode;


    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Integer getOrgParentId() {
        return orgParentId;
    }

    public void setOrgParentId(Integer orgParentId) {
        this.orgParentId = orgParentId;
    }

    public String getOrgPath() {
        return orgPath;
    }

    public void setOrgPath(String orgPath) {
        this.orgPath = orgPath;
    }

    public Integer getOrgShortId() {
        return orgShortId;
    }

    public void setOrgShortId(Integer orgShortId) {
        this.orgShortId = orgShortId;
    }

    public String getOrgShortName() {
        return orgShortName;
    }

    public void setOrgShortName(String orgShortName) {
        this.orgShortName = orgShortName;
    }

    public Integer getOrgState() {
        return orgState;
    }

    public void setOrgState(Integer orgState) {
        this.orgState = orgState;
    }

    public Date getOrgCreateDate() {
        return orgCreateDate;
    }

    public void setOrgCreateDate(Date orgCreateDate) {
        this.orgCreateDate = orgCreateDate;
    }

    public Date getOrgUpdateDate() {
        return orgUpdateDate;
    }

    public void setOrgUpdateDate(Date orgUpdateDate) {
        this.orgUpdateDate = orgUpdateDate;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    @Override
    public String toString() {
        return "CloudOrgModel{" +
        "orgId=" + orgId +
        ", orgName=" + orgName +
        ", orgParentId=" + orgParentId +
        ", orgPath=" + orgPath +
        ", orgShortId=" + orgShortId +
        ", orgShortName=" + orgShortName +
        ", orgState=" + orgState +
        ", orgCreateDate=" + orgCreateDate +
        ", orgUpdateDate=" + orgUpdateDate +
        ", orgCode=" + orgCode +
        "}";
    }
}
