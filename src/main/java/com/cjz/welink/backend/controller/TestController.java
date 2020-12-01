package com.cjz.welink.backend.controller;

import com.cjz.welink.backend.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@ControllerAdvice
@Controller
public class TestController {

    @Autowired
    IssueService issueService;


    @GetMapping("/test")
    public void testTeams(@RequestParam String name){
        System.out.println(name);

    }

}
