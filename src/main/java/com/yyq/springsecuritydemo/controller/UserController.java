package com.yyq.springsecuritydemo.controller;

import com.yyq.springsecuritydemo.entity.User;
import com.yyq.springsecuritydemo.jpa.UserJPA;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yyq
 * @date 2018/3/24 14:53
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserJPA userJPA;

    @GetMapping("/list")
    public List<User> list() {
        return userJPA.findAll();
    }

   /* @GetMapping("/{id}")
    public User selectOne(@PathVariable Long id) {
        return userJPA.findById(id).get();
    }

    @PostMapping("/save")
    public User save(User user) {
        return userJPA.save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userJPA.deleteById(id);
    }*/

}
