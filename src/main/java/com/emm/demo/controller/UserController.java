package com.emm.demo.controller;

import com.emm.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    private List<User> userList = new ArrayList<>();

    @GetMapping("/")
    public String loadHomePage(){
        return "Home Page - Demo \n try /user endpoint ";
    }

    @GetMapping("/user")
    public User getUser(){
        return new User("Emmanuel","Moila","eppy@gts.com");
    }

}
