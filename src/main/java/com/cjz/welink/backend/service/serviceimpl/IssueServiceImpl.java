package com.cjz.welink.backend.service.serviceimpl;

import com.cjz.welink.backend.dao.IssueEntityDao;
import com.cjz.welink.backend.domain.IssueEntity;
import com.cjz.welink.backend.module.IssueAndSectionDto;
import com.cjz.welink.backend.module.IssueAndSectionMapClass;
import com.cjz.welink.backend.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.data.domain.Pageable;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Component
public class IssueServiceImpl implements IssueService {

    @Autowired
    IssueEntityDao issueEntityDao;

    @Override
    public void getUnsolvedIssueList() {

        Specification<IssueEntity> specification=new Specification<IssueEntity>() {
            @Override
            public Predicate toPredicate(Root<IssueEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

                Path<Object> path= root.get("status");
                Predicate predicate=criteriaBuilder.equal(path,"unsolved");

                return predicate;
            }
        };

        Pageable p =PageRequest.of(0,2);

        List<IssueAndSectionDto> issuelist=new ArrayList<>();
        Page<IssueEntity> page=issueEntityDao.findAll(specification,p);
        System.out.println(page.getContent());

    }

    @Override
    public IssueAndSectionMapClass getUnsolvedIssueAndDepartment() {
        Specification<IssueEntity> specification=new Specification<IssueEntity>() {
            @Override
            public Predicate toPredicate(Root<IssueEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

                Path path= root.get("status");
                Predicate predicate=criteriaBuilder.equal(path,"unsolved");


                return predicate;
            }
        };

        List<IssueEntity>list=issueEntityDao.findAll(specification,Sort.by(Sort.Direction.DESC,"issueCount"));

        List<IssueAndSectionDto> issueAndSectionDtoList=new ArrayList<>();

        for (IssueEntity aList : list) {

            issueAndSectionDtoList.add(new IssueAndSectionDto(aList.getId(),
                        aList.getProductname(),
                        aList.getWorkorder(),
                        aList.getMaterialid(),
                        aList.getIssuetype(),
                        aList.getIssuestarttime(),
                        aList.getIssuespendtime(),
                        aList.getIssuefihishtime(),
                        aList.getStatus(),
                        aList.getReason(),
                        aList.getIssue_actual_finishtime(),
                        aList.getIssue_count(),
                        aList.getIssue_solved_person(),
                        aList.getGetIssue_solved_method(),
                        aList.getTask_key(),
                        aList.getDepartment(),
                        aList.getIssue_need_day(),
                        aList.getDepartmentEntity().getSection()));
        }

        Map<String,Integer> map=new HashMap<>();
        for(IssueAndSectionDto list1:issueAndSectionDtoList){

            Integer integer=map.get(list1.getSection());
            map.put(list1.getSection(),integer==null?1:integer+1);
        }

        return new IssueAndSectionMapClass(issueAndSectionDtoList,map);

    }

    @Override
    public IssueAndSectionMapClass getUnsolvedIssueAndProduct() {

    Specification<IssueEntity>specification=new Specification<IssueEntity>() {
        @Override
        public Predicate toPredicate(Root<IssueEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

            Path path=root.get("status");
            Predicate predicate1=criteriaBuilder.equal(path,"Doing");
            Predicate predicate2=criteriaBuilder.equal(path,"Unsolved");
            Predicate predicate=criteriaBuilder.or(predicate1,predicate2);

            return predicate;
        }
    };

        List<IssueEntity>list=issueEntityDao.findAll(specification,Sort.by(Sort.Direction.DESC,"issueCount"));

        List<IssueAndSectionDto> issueAndSectionDtoList=new ArrayList<>();

        for (IssueEntity aList : list) {

            issueAndSectionDtoList.add(new IssueAndSectionDto(aList.getId(),
                    aList.getProductname(),
                    aList.getWorkorder(),
                    aList.getMaterialid(),
                    aList.getIssuetype(),
                    aList.getIssuestarttime(),
                    aList.getIssuespendtime(),
                    aList.getIssuefihishtime(),
                    aList.getStatus(),
                    aList.getReason(),
                    aList.getIssue_actual_finishtime(),
                    aList.getIssue_count(),
                    aList.getIssue_solved_person(),
                    aList.getGetIssue_solved_method(),
                    aList.getTask_key(),
                    aList.getDepartment(),
                    aList.getIssue_need_day(),
                    aList.getDepartmentEntity().getSection()));
        }

        Map<String,Integer> map=new HashMap<>();
        for(IssueAndSectionDto list1:issueAndSectionDtoList){

            Integer integer=map.get(list1.getProductname());
            map.put(list1.getProductname(),integer==null?1:integer+1);
        }

        System.out.println(map);
        return new IssueAndSectionMapClass(issueAndSectionDtoList,map);

    }

    @Override
    public List<IssueEntity> getIssueListById(String id, int pageNumber, int pageSize) {

        Specification<IssueEntity> specification=new Specification<IssueEntity>() {
            @Override
            public Predicate toPredicate(Root<IssueEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

                Path path=root.get("id");

                return criteriaBuilder.equal(path,id);
            }
        };

        Pageable pageable=PageRequest.of(pageNumber,pageSize,Sort.by(Sort.Direction.DESC,"issueCount"));
        List<IssueEntity>list= issueEntityDao.findAll(specification,pageable).getContent();

        return list;
    }

    @Override
    public List<IssueEntity> getIssueListByProductname(String productName,int pageNumber, int pageSize) {

        Specification<IssueEntity> specification=new Specification<IssueEntity>() {
            @Override
            public Predicate toPredicate(Root<IssueEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

                Path path=root.get("productname");

                return criteriaBuilder.equal(path,productName);
            }
        };

        Pageable pageable=PageRequest.of(pageNumber,pageSize,Sort.by(Sort.Direction.DESC,"issueCount"));
        List<IssueEntity>list= issueEntityDao.findAll(specification,pageable).getContent();

        return list;
    }

    @Override
    public List<IssueEntity> getIssueListByWorkorder(String workorder,int pageNumber, int pageSize) {

        Specification<IssueEntity> specification=new Specification<IssueEntity>() {
            @Override
            public Predicate toPredicate(Root<IssueEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

                Path path=root.get("workorder");

                return criteriaBuilder.equal(path,workorder);
            }
        };

        Pageable pageable=PageRequest.of(pageNumber,pageSize,Sort.by(Sort.Direction.DESC,"issueCount"));
        List<IssueEntity>list= issueEntityDao.findAll(specification,pageable).getContent();

        return list;
    }

    @Override
    public List<IssueEntity> getIssueListByMaterialid(String materialid, int pageNumber, int pageSize) {

        Specification<IssueEntity> specification=new Specification<IssueEntity>() {
            @Override
            public Predicate toPredicate(Root<IssueEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

                Path path=root.get("materialid");

                return criteriaBuilder.equal(path,materialid);
            }
        };

        Pageable pageable=PageRequest.of(pageNumber,pageSize,Sort.by(Sort.Direction.DESC,"issueCount"));
        List<IssueEntity>list= issueEntityDao.findAll(specification,pageable).getContent();

        return list;
    }

    @Override
    public List<IssueEntity> getIssueListByIssuetype(String issuetype,int pageNumber, int pageSize) {

        Specification<IssueEntity> specification=new Specification<IssueEntity>() {
            @Override
            public Predicate toPredicate(Root<IssueEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

                Path path=root.get("issuetype");

                return criteriaBuilder.equal(path,issuetype);
            }
        };

        Pageable pageable=PageRequest.of(pageNumber,pageSize,Sort.by(Sort.Direction.DESC,"issueCount"));
        List<IssueEntity>list= issueEntityDao.findAll(specification,pageable).getContent();

        return list;
    }

    @Override
    public List<IssueEntity> getIssueListByStatus(String status,int pageNumber, int pageSize) {

        Specification<IssueEntity> specification=new Specification<IssueEntity>() {
            @Override
            public Predicate toPredicate(Root<IssueEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

                Path path=root.get("status");

                return criteriaBuilder.equal(path,status);
            }
        };

        Pageable pageable=PageRequest.of(pageNumber,pageSize,Sort.by(Sort.Direction.DESC,"issueCount"));
        List<IssueEntity>list= issueEntityDao.findAll(specification,pageable).getContent();

        return list;
    }

    @Override
    public List<IssueEntity> getAllIssueList(int pageNumber, int pageSize) {

        Pageable pageable=PageRequest.of(pageNumber,pageSize,Sort.by(Sort.Direction.DESC,"issueCount"));
        List<IssueEntity>list= issueEntityDao.findAll(pageable).getContent();

        return list;
    }

    @Override
    public int insertIssue(IssueEntity issueEntity) {

       return issueEntityDao.save(issueEntity).getIssue_count();

    }

    @Override
    public void deleteIssue(IssueEntity issueEntity) {

        issueEntityDao.delete(issueEntity);

    }
}
