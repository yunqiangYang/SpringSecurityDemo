package com.yyq.springsecuritydemo.service;

import com.yyq.springsecuritydemo.entity.User;
import com.yyq.springsecuritydemo.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author yyq
 * @date 2018/3/29 17:55
 */
@Service
public class CustomUserService implements UserDetailsService {

    @Autowired
    private UserJPA userJPA;

    /**
     * 根据用户名来获取用户
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userJPA.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("用户："+username+"不存在！");
        }
        return user;
    }
}
