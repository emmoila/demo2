package com.emm.demo.controller;

import com.emm.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(){
        return new User("Emmanuel","Moila","eppy@gts.com");
    }
}
