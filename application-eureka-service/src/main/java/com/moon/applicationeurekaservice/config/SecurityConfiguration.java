package com.moon.applicationeurekaservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Author : moon
 * Date  : 2018/12/18 21:45
 * Description : Class for springsecurity配置类
 */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {


    /**
     * 配置安全信息
     * -禁用csrf攻击功能
     * -开启所有需要验证并且使用http basic进行验证
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf()
                .disable()
                .authorizeRequests()
                .anyRequest().authenticated()
                .and().httpBasic();
    }
}
