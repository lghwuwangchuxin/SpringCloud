package com.cloud.organization.query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.cloud.common.utils.MyStringUtils;
import com.cloud.model.organization.CloudOrg;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Auther: lgh
 * @Date: 2019/4/29 10:01
 * @Description:组织条件封装类
 * 查询条件封装
 *  * 业务不一样，查询条件也不一样，需要自己封装
 *  * 封装方式请看官网实例
 *  * 	 简单实例：
 * 	 	http://mp.baomidou.com/#/wrapper?id=%E7%AE%80%E5%8D%95%E7%A4%BA%E4%BE%8B
 * 	 条件参数说明：
 * 	    http://mp.baomidou.com/#/wrapper?id=%E6%9D%A1%E4%BB%B6%E5%8F%82%E6%95%B0%E8%AF%B4%E6%98%8E
 */
@Data
public class OrgQuery implements java.io.Serializable{
    @ApiModelProperty(value="创建时间")
    private String createTime="org_create_date";
    @ApiModelProperty(value="排序类别（ ASC DESC）")
    private String sortOrder="asc";
    /**
     * 以下查询条件，根据自己的业务和前端对接
     */
    @ApiModelProperty(value="组织名称")
    private String orgName;

    @ApiModelProperty(value="路径")
    private String orgPath;
    @ApiModelProperty(value="组织代码")
    private String orgCode;
    public QueryWrapper<CloudOrg> queryWrap() {
        QueryWrapper<CloudOrg> column = new QueryWrapper<CloudOrg>();
        if(!StringUtils.isEmpty(orgName)) column.like("org_name", orgName);
        if(!StringUtils.isEmpty(orgPath)) column.like("org_path", orgPath);
        /*if (!StringUtils.isEmpty(createTime)) {
            if ("ASC".equals(sortOrder.toUpperCase())) {
                column.orderByAsc(MyStringUtils.CoverLineStr(createTime));
            } else {
                column.orderByDesc(MyStringUtils.CoverLineStr(createTime));
            }
        }else {
            column.orderByDesc("org_create_date");
        }*/
        return column;
    }
}
