package com.cjz.welink.backend.controller;

import com.cjz.welink.backend.result.Result;
import com.cjz.welink.backend.result.ResultUtil;
import com.cjz.welink.backend.service.TaskService;
import com.cjz.welink.backend.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class LayoutController {

    @Autowired
    IssueService issueService;

    @Autowired
    TaskService taskService;


    @GetMapping("/getIssueAndProductname")
    public Result getIssuelistAndDepartment(){

        System.out.println(issueService.getUnsolvedIssueAndProduct());
        return ResultUtil.success(issueService.getUnsolvedIssueAndProduct());

    }


    @RequestMapping("/getTaskAndProductname")
    public Result getTaskAndProductname(){
        System.out.println(taskService.getDoingTaskAndProduct());
        return ResultUtil.success(taskService.getDoingTaskAndProduct());
    }
}
