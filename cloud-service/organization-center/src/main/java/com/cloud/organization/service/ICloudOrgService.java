package com.cloud.organization.service;

import com.cloud.organization.model.CloudOrgModel;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lgh
 * @since 2019-04-25
 */
public interface ICloudOrgService extends IService<CloudOrgModel> {
    int addOrg(CloudOrgModel org);



}
