package com.cjz.welink.backend.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Oauth2Controller {

    @RequestMapping("/getCurrentUser")
    public Object getCurrentUser(Authentication authentication) {

        return authentication.getPrincipal();
    }
}