package com.cjz.welink.backend.service;


import com.cjz.welink.backend.domain.IssueTypeEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IssueTypeService {

    List<IssueTypeEntity>findAll();

}
