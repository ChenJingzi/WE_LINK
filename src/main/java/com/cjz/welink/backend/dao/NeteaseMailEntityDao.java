package com.cjz.welink.backend.dao;

import com.cjz.welink.backend.domain.NeteaseMailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface NeteaseMailEntityDao extends JpaRepository<NeteaseMailEntity,Integer>,JpaSpecificationExecutor<NeteaseMailEntity> {
}
