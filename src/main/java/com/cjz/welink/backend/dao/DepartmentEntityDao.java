package com.cjz.welink.backend.dao;

import com.cjz.welink.backend.domain.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DepartmentEntityDao extends JpaRepository<DepartmentEntity,String>,JpaSpecificationExecutor<DepartmentEntity> {


}
