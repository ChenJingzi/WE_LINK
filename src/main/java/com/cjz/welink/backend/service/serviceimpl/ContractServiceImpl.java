package com.cjz.welink.backend.service.serviceimpl;

import com.cjz.welink.backend.dao.ContractEntityDao;
import com.cjz.welink.backend.domain.ContractEntity;
import com.cjz.welink.backend.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import javax.persistence.criteria.*;
import java.util.List;

@Component
public class ContractServiceImpl implements ContractService {

    @Autowired
    ContractEntityDao contractEntityDao;


    @Override
    public List<ContractEntity> getContractList() {

        List<ContractEntity> list=contractEntityDao.findAll();
        System.out.println(list);
        return list;
    }

    @Override
    public List<ContractEntity> getContractWithoutEndDate() {

        Specification specification=new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Path path=root.get("LeadTime");
                Predicate predicate=criteriaBuilder.equal(path,1);

                return predicate;
            }
        };

        List list=contractEntityDao.findAll(specification);

        System.out.println(list);

        return list;
    }

    @Override
    public void insertAndUpdateContract(ContractEntity contractEntity) {

        contractEntityDao.save(contractEntity);
        System.out.println("成功执行");

    }
}
