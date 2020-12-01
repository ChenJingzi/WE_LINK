package com.cjz.welink.backend.dao;

import com.cjz.welink.backend.domain.IssueTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IssueTypeEntityDao extends JpaRepository<IssueTypeEntity,String>,JpaSpecificationExecutor<String> {
}
