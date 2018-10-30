package com.ganesh.controller;

import com.ganesh.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller()
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public ModelAndView login(){
        System.out.println("UserController : Login ModelAndView Called");
        return  new ModelAndView("/user/login");
    }

    @RequestMapping("/authenticate")
    public ModelAndView authenticate(){
        userService.authenticate("Ganesh","babu");
        System.out.println("UserController : authenticate Called");
        return  new ModelAndView("/user/home");
    }
}
