package com.cjz.welink.backend.service;

import com.cjz.welink.backend.domain.ContractEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ContractService {
    List<ContractEntity> getContractList();
    List<ContractEntity> getContractWithoutEndDate();
    void insertAndUpdateContract(ContractEntity contractEntity);

}
