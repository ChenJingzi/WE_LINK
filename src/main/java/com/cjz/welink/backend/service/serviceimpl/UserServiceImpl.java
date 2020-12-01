package com.cjz.welink.backend.service.serviceimpl;

import com.cjz.welink.backend.dao.UserEntityDao;
import com.cjz.welink.backend.domain.UserEntity;
import com.cjz.welink.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    UserEntityDao userEntityDao;

    @Override
    public List getAllUserList(int pageNumber,int pageSize) {
        Pageable pageable= PageRequest.of(pageNumber,pageSize, Sort.by(Sort.Direction.ASC,"id"));

        return  userEntityDao.findAll(pageable).getContent();
    }

    @Override
    public void insertUser(UserEntity userEntity) {

        userEntityDao.save(userEntity);

    }

    @Override
    public void deleteUser(UserEntity userEntity) {

        userEntityDao.delete(userEntity);
    }

}
