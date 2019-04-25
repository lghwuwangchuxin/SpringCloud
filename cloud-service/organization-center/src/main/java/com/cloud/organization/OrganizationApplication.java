package com.cloud.organization;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

/**
 * 组织中心
 *
 * @author lgh
 */
@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.cloud.organization.mapper")
public class OrganizationApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrganizationApplication.class, args);
    }
    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
