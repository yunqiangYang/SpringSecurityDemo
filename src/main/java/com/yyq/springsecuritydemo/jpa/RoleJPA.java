package com.yyq.springsecuritydemo.jpa;

import com.yyq.springsecuritydemo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @author yyq
 * @date 2018/3/27 19:35
 */
public interface RoleJPA extends JpaRepository<Role,Integer>,JpaSpecificationExecutor<Role>,Serializable {
}
