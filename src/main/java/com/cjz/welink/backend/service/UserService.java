package com.cjz.welink.backend.service;

import com.cjz.welink.backend.domain.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    //所有获取user的操作均升序

    List getAllUserList(int pageNumber,int pageSize);

    //增,改
    void insertUser(UserEntity userEntity);

    //删
    void deleteUser(UserEntity userEntity);

}
