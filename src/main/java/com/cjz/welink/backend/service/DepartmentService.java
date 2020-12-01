package com.cjz.welink.backend.service;

import com.cjz.welink.backend.domain.DepartmentEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {

    //增,改 name是主键
    void insertDpartment(DepartmentEntity departmentEntity);

    //删
    void deleteDpartment(DepartmentEntity departmentEntity);

    //查
    List<DepartmentEntity> getDpartmentList(int pageNumber, int pageSize);

}
