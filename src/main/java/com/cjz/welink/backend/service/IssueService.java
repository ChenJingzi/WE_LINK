package com.cjz.welink.backend.service;


import com.cjz.welink.backend.domain.IssueEntity;
import com.cjz.welink.backend.module.IssueAndSectionMapClass;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IssueService {

    //所有查询根据issuecount做倒序查询

    void getUnsolvedIssueList();

    //查询

     IssueAndSectionMapClass getUnsolvedIssueAndDepartment();

     IssueAndSectionMapClass getUnsolvedIssueAndProduct();

     List<IssueEntity>getIssueListById(String id,int pageNumber, int pageSize);

     List<IssueEntity>getIssueListByProductname(String productName,int pageNumber, int pageSize);

     List<IssueEntity>getIssueListByWorkorder(String workorder,int pageNumber, int pageSize);

     List<IssueEntity>getIssueListByMaterialid(String materialid,int pageNumber, int pageSize);

     List<IssueEntity>getIssueListByIssuetype(String issuetype,int pageNumber, int pageSize);

     List<IssueEntity>getIssueListByStatus(String status,int pageNumber, int pageSize);

     List<IssueEntity>getAllIssueList(int pageNumber, int pageSize);

     //增加修改，未传入issue_count则增加
     int insertIssue(IssueEntity issueEntity);

     //删除
     void deleteIssue(IssueEntity issueEntity);

}
