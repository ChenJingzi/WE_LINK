package com.cjz.welink.backend.dao;

import com.cjz.welink.backend.domain.IssueEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IssueEntityDao extends JpaRepository<IssueEntity,Integer>,JpaSpecificationExecutor<IssueEntity> {


}
