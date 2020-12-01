package com.cjz.welink.backend.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/login-success")
    public String loginSuccess(){
        return "Success";
    }
    @RequestMapping("/login-error")
    public String loginError(){
        return "Error";
    }

    //@Secured("ROLE_abc")
  //  @PreAuthorize("hasRole('admin')")
    @RequestMapping("/role1")
    public String loginRole1(){
        return "role1";
    }
    @RequestMapping("/admin")
    public String loginadmin(){
        return "admin";
    }
}
