package com.cloud.organization;

import com.cloud.model.organization.CloudOrgModel;
import com.cloud.organization.service.ICloudOrgService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class OrganizationTest {
    @Autowired
    private ICloudOrgService orgservice;
@Test
public void  inserOrg(){
    /*CloudOrgModel org=new CloudOrgModel();
    org.setOrgCode("1");
    orgservice.insertOrg(org);*/
    System.out.println("sdfaf");
}

}
