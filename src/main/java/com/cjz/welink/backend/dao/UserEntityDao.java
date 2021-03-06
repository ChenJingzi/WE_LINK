package com.cjz.welink.backend.dao;

import com.cjz.welink.backend.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserEntityDao extends JpaSpecificationExecutor<UserEntity>,JpaRepository<UserEntity,String> {
}
