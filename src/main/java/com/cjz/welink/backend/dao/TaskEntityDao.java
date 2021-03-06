package com.cjz.welink.backend.dao;

import com.cjz.welink.backend.domain.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TaskEntityDao extends JpaRepository<TaskEntity,Integer>,JpaSpecificationExecutor<TaskEntity> {
}
