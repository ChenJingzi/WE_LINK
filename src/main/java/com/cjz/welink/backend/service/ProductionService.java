package com.cjz.welink.backend.service;

import com.cjz.welink.backend.domain.ProductionEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductionService {

    List<ProductionEntity> getProductionList();

}
