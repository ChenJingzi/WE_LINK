package com.cjz.welink.backend.dao;

import com.cjz.welink.backend.domain.ProductionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Component;


@Component
public interface ProductionEntityDao extends JpaRepository<ProductionEntity,Integer>,JpaSpecificationExecutor<ProductionEntity>{
}
