package com.maduar.admin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/*
 *
 * @author maduar
 * @date 29/08/2018 5:23 PM
 * @email maduar@163.com
 *
 * */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        String appurl = "/api/applications";

        http
                .formLogin()
                .loginPage("/login.html")
                .loginProcessingUrl("/login")
                .permitAll();
        http
                .logout().logoutUrl("/logout");
        http
                .csrf().disable();
        http
                .authorizeRequests()
                .antMatchers("/login.html", "/**/*.css", "/img/**", "/third-party/**", appurl)
                .permitAll();
        http
                .authorizeRequests()
                .antMatchers("/**")
                .authenticated();
        http.httpBasic();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("admin").password("admin").roles("ADMIN").build());
        manager.createUser(User.withUsername("client").password("client").roles("USER").build());
        return manager;
    }
}
