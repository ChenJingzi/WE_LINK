package com.cjz.welink.backend.service.serviceimpl;

import com.cjz.welink.backend.dao.ProductionEntityDao;
import com.cjz.welink.backend.domain.ProductionEntity;
import com.cjz.welink.backend.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductionServiceImpl implements ProductionService {

    @Autowired
    ProductionEntityDao productionEntityDao;

    @Override
    public List<ProductionEntity> getProductionList() {

       List<ProductionEntity> list= productionEntityDao.findAll(Sort.by(Sort.Direction.ASC,"productId"));

        System.out.println(list);

        return list;
    }

}
