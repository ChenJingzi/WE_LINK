package com.cjz.welink.backend.service.serviceimpl;

import com.cjz.welink.backend.dao.UserEntityDao;
import com.cjz.welink.backend.domain.UserEntity;
import com.cjz.welink.backend.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import javax.persistence.criteria.*;

@Component
public class LoginServiceImpl implements LoginService{

    @Autowired
    UserEntityDao userEntityDao;


    @Override
    public boolean judgementPasswordAccordingUserName(String username,int password) {

        Specification<UserEntity> specification=new Specification<UserEntity>() {
            @Override
            public Predicate toPredicate(Root<UserEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

                Path path=root.get("id");
                return criteriaBuilder.equal(path,username);
            }
        };

        Boolean ifEqual=(password==userEntityDao.findOne(specification).get().getPassword());

        return ifEqual;
    }

    @Override
    public String getPaasowordByUserName(String username) {

        Specification<UserEntity>specification=new Specification<UserEntity>() {
            @Override
            public Predicate toPredicate(Root<UserEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

                Path path=root.get("id");

                return criteriaBuilder.equal(path,username);
            }
        };
        return String.valueOf(userEntityDao.findOne(specification).get().getPassword());
    }

}
