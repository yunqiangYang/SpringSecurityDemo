package com.yyq.springsecuritydemo.config;

import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yyq
 * @date 2018/3/24 17:29
 */
@Configuration
public class DruidConfiguration {

    @Bean
    public ServletRegistrationBean statViewServlet(){
        //创建servlet注册实体
        ServletRegistrationBean<StatViewServlet> registrationBean = new ServletRegistrationBean<>(new StatViewServlet(),"/druid/*");

        /**************设置初始化参数*************/
        //设置白名单
        registrationBean.addInitParameter("allow","127.0.0.1");

        //设置黑名单
        //registrationBean.addInitParameter("deny","");

        //设置账户密码


        return registrationBean;

    }
}
