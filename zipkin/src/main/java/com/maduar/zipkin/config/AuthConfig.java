package com.maduar.zipkin.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/*
 *
 * @author maduar
 * @date 07/09/2018 4:41 PM
 * @email maduar@163.com
 *
 * */
@Configuration
public class AuthConfig extends WebSecurityConfigurerAdapter {

    @Value("${securityUser.actuatorUser.username}")
    private String actuatorUserName;

    @Value("${securityUser.actuatorUser.password}")
    private String actuatorUserPassword;

    @Value("${securityUser.adminUser.username}")
    private String adminUserName;

    @Value("${securityUser.adminUser.password}")
    private String adminUserPassword;


    @Value("${securityUser.role.admin}")
    private String admin;

    @Value("${securityUser.role.actuator}")
    private String actuator;

//    @Value("${server.context-path}")
//    private String contextPath;

    /**
     * 重写该方法，添加自定义用户
     * */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser(adminUserName).password(adminUserPassword).roles(admin, actuator)
                .and()
                // for mgmgt server
                .withUser(actuatorUserName).password(actuatorUserPassword).roles(actuator);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        // 对静态资源，注册地址放行
        http
                .authorizeRequests()
                .antMatchers("/login.html", "/**/*.css", "/img/**", "/third-party/**")
                .permitAll()
                .antMatchers("/**")
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/login.html")
                .loginProcessingUrl("/login")
                .permitAll()
                .and()
                .logout().logoutUrl("/logout")
                .and()
                .httpBasic()
                .and()
                .csrf().disable();
    }

}
