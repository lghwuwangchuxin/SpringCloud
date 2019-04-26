package com.cloud.organization.service.impl;

import com.cloud.organization.model.CloudOrgModel;
import com.cloud.organization.mapper.CloudOrgMapper;
import com.cloud.organization.service.ICloudOrgService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lgh
 * @since 2019-04-25
 */
@Service
public class CloudOrgServiceImpl extends ServiceImpl<CloudOrgMapper, CloudOrgModel> implements ICloudOrgService {
    @Autowired
    private CloudOrgMapper orgDao;
    @Override
    public int addOrg(CloudOrgModel org) {
        return orgDao.insert(org);
    }
}
