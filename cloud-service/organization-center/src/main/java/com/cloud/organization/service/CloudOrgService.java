package com.cloud.organization.service;

import com.cloud.common.page.PageUtils;
import com.cloud.common.response.Result;
import com.cloud.model.organization.CloudOrg;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.organization.query.OrgQuery;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lgh
 * @since 2019-04-28
 */
public interface CloudOrgService extends IService<CloudOrg> {
    /**
     * 组织分页
     * @param page
     * @return
     */
    public Result<Object> queryPage(PageUtils<OrgQuery> page);
}
