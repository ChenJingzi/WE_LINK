package com.cjz.welink.backend.service.serviceimpl;

import com.cjz.welink.backend.dao.DepartmentEntityDao;
import com.cjz.welink.backend.domain.DepartmentEntity;
import com.cjz.welink.backend.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentEntityDao departmentEntityDao;

    @Override
    public void insertDpartment(DepartmentEntity departmentEntity) {
        departmentEntityDao.save(departmentEntity);
    }

    @Override
    public void deleteDpartment(DepartmentEntity departmentEntity) {
        departmentEntityDao.delete(departmentEntity);
    }

    @Override
    public List<DepartmentEntity> getDpartmentList(int pageNumber, int pageSize) {
        Pageable pageable= PageRequest.of(pageNumber,pageSize, Sort.by(Sort.Direction.ASC,"name"));

        return departmentEntityDao.findAll(pageable).getContent();
    }
}
