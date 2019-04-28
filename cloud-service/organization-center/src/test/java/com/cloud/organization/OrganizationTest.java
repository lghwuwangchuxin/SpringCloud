package com.cloud.organization;

import com.cloud.organization.model.CloudOrg;

import com.cloud.organization.service.CloudOrgService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class OrganizationTest {
@Autowired
private CloudOrgService coudOrgService;
@Test
public void  inserOrg(){
   CloudOrg org=new CloudOrg();
   org.setOrgCode("1");
   org.setOrgPath("1213");
   coudOrgService.save(org);
   System.out.println("dfsfgsgsg");

}

}
