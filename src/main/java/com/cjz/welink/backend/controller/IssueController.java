package com.cjz.welink.backend.controller;

import com.cjz.welink.backend.result.Result;
import com.cjz.welink.backend.result.ResultUtil;
import com.cjz.welink.backend.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class IssueController {

    @Autowired
    IssueService issueService;


    @GetMapping("/getUnsolvedIssueAndDepartment")
    public Result getIssuelistAndDepartment(){

        System.out.println(issueService.getUnsolvedIssueAndDepartment());
        return ResultUtil.success(issueService.getUnsolvedIssueAndDepartment());

    }




}
