package com.yyq.springsecuritydemo.jpa;

import com.yyq.springsecuritydemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * @author yyq
 * @date 2018/3/24 15:03
 */
public interface UserJPA extends JpaRepository<User,Long>,JpaSpecificationExecutor<User>,Serializable {
    User findByUsername(String username);
}
