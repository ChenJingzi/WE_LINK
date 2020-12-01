package com.cjz.welink.backend.dao;

import com.cjz.welink.backend.domain.ContractEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ContractEntityDao extends JpaRepository<ContractEntity,String> ,JpaSpecificationExecutor<ContractEntity>{
}
