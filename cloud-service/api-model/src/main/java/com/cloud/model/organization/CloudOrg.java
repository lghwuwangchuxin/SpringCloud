package com.cloud.model.organization;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lgh
 * @since 2019-04-28
 */
@Data
public class CloudOrg implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "org_id", type = IdType.AUTO)
    private Long orgId;

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
}
