package com.cloud.organization.config;

import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * 开启session共享
 * 
 * @author lgh
 *
 */
@EnableRedisHttpSession
public class SessionConfig {

}
