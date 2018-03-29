package com.yyq.springsecuritydemo.config;

import com.yyq.springsecuritydemo.service.CustomUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author yyq
 * @date 2018/3/29 18:06
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    UserDetailsService customUserService(){return new CustomUserService();}

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .anyRequest().authenticated()//所有路径登录后才能访问
                .and()
                    .formLogin()
                    .loginPage("/login")
                    .failureUrl("/login?error")
                    .permitAll()//允许访问登录页面
                .and()
                    .logout()
                    .permitAll();//允许访问登出
    }
}
