package com.cloud.organization.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.cloud.common.page.PageUtils;
import com.cloud.common.response.ResponseUtil;
import com.cloud.common.response.Result;
import com.cloud.model.organization.CloudOrg;
import com.cloud.organization.mapper.CloudOrgDao;
import com.cloud.organization.query.OrgQuery;
import com.cloud.organization.service.CloudOrgService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lgh
 * @since 2019-04-28
 */
@Service
public class CloudOrgServiceImpl extends ServiceImpl<CloudOrgDao, CloudOrg> implements CloudOrgService {
    @Resource
    private CloudOrgDao cloudorgdao;
    @Override
    public Result<Object> queryPage(PageUtils<OrgQuery> page) {
        IPage<CloudOrg> selectPage = cloudorgdao.selectPage(new Page<CloudOrg>(page.getPageNum(),page.getPageSize()), page.getQueryColumn().queryWrap());
        return ResponseUtil.ok(page.getResultMap(selectPage.getRecords(), selectPage.getTotal()));
    }
}
