package com.cloud.organization;

import com.cloud.common.page.PageUtils;
import com.cloud.model.organization.CloudOrg;

import com.cloud.organization.query.OrgQuery;
import com.cloud.organization.service.CloudOrgService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.http.HttpServletRequest;


@SpringBootTest
@RunWith(SpringRunner.class)
public class OrganizationTest {
@Autowired
private CloudOrgService coudOrgService;
@Test
public void  inserOrg(){
   for (int i=0;i<=10;i++){
      CloudOrg org=new CloudOrg();
      org.setOrgCode("A"+i);
      coudOrgService.save(org);
   }
}
@Test
public void getOrg(){
   CloudOrg org=coudOrgService.getById(2);
   System.out.println(org.getOrgName());
}
@Test
public  void queryPage(){
   PageUtils<OrgQuery> page=new PageUtils<OrgQuery>();
   OrgQuery org=new OrgQuery();
   page.setQueryColumn(org);
   coudOrgService.queryPage(page);
}
}
