package com.cjz.welink.backend.controller;

import com.cjz.welink.backend.result.Result;
import com.cjz.welink.backend.result.ResultUtil;
import com.cjz.welink.backend.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContractController {

    @Autowired
    ContractService contractService;

    @PostAuthorize("hasAnyAuthority('admin')")
    @GetMapping("/getcontract")
    public Result getContractList(){
        System.out.println("contract列表是："+contractService.getContractWithoutEndDate());
        return ResultUtil.success(contractService.getContractWithoutEndDate());
    }

}
