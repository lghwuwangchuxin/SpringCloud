package com.cloud.organization.controller;


import com.cloud.common.page.PageUtils;
import com.cloud.common.response.Result;
import com.cloud.model.organization.CloudOrg;
import com.cloud.organization.query.OrgQuery;
import com.cloud.organization.service.CloudOrgService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lgh
 * @since 2019-04-28
 */
@RestController
@RequestMapping("/cloudOrg")
@Api(value="组织机构",description="组织机构关接口信息")
public class CloudOrgController {
    @Autowired
    private CloudOrgService cloudOrgService;
    @PostMapping("queryPage")
    @ApiOperation(value = "查询所有数据，带分页、排序", notes = "参数格式：{'pageSize':10,'pageNum':1,'queryColumn':{'name':'xxx'}}")
    public Result<Object> queryPage(HttpServletRequest req) {
        return cloudOrgService.queryPage(new PageUtils<>(OrgQuery.class, req));
    }
}

