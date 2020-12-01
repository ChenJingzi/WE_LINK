package com.cjz.welink.backend.service.serviceimpl;

import com.cjz.welink.backend.dao.IssueTypeEntityDao;
import com.cjz.welink.backend.domain.IssueTypeEntity;
import com.cjz.welink.backend.service.IssueTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IssueTypeServiceImpl implements IssueTypeService{

    @Autowired
    IssueTypeEntityDao issueTypeEntityDao;


    @Override
    public List<IssueTypeEntity> findAll() {

        List list=issueTypeEntityDao.findAll(Sort.by(Sort.Direction.ASC,"issueTypeCode"));

        System.out.println(list);

        return list;
    }
}
