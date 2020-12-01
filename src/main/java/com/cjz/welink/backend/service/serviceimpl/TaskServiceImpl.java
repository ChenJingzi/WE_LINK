package com.cjz.welink.backend.service.serviceimpl;

import com.cjz.welink.backend.dao.TaskEntityDao;
import com.cjz.welink.backend.domain.TaskEntity;
import com.cjz.welink.backend.module.TaskAndProductMapClass;
import com.cjz.welink.backend.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import javax.persistence.criteria.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskEntityDao taskEntityDao;

    @Override
    public TaskAndProductMapClass getDoingTaskAndProduct() {

        Specification<TaskEntity> specification=new Specification<TaskEntity>() {
            @Override
            public Predicate toPredicate(Root<TaskEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {

                Path path=root.get("status");

                return criteriaBuilder.equal(path,"Doing");
            }

        };

        List<TaskEntity>list=taskEntityDao.findAll(specification,Sort.by(Sort.Direction.DESC,"taskKey"));

        Map<String,Integer> map=new HashMap<>();
        for(TaskEntity list1:list){

            Integer integer=map.get(list1.getProductname());
            map.put(list1.getProductname(),integer==null?1:integer+1);
        }

        return new TaskAndProductMapClass(list,map);
    }


    //返回taskkey
    @Override
    public int insertAndUpdateTask(TaskEntity taskEntity) {
        return taskEntityDao.save(taskEntity).getTaskkey();
    }

    @Override
    public List getTaskListByStatus(String status, int pageNumber, int pageSize) {

        Specification specification=new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Path path=root.get("status");
                Predicate predicate=criteriaBuilder.equal(path,status);
                return predicate;
            }
        };

        Pageable pageable=PageRequest.of(pageNumber,pageSize,Sort.by(Sort.Direction.DESC,"taskKey"));

        List list=taskEntityDao.findAll(specification,pageable).getContent();

        System.out.println(list);

        return list;
    }

    @Override
    public TaskEntity getDoingTaskById(String id) {

        Specification specification=new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {

                Path path1=root.get("id");
                Path path2=root.get("status");

                Predicate predicate1=criteriaBuilder.equal(path1,id);
                Predicate predicate2=criteriaBuilder.equal(path2,"Doing");

                return criteriaBuilder.and(predicate1,predicate2);
            }
        };
       TaskEntity taskEntity=(TaskEntity)taskEntityDao.findOne(specification).get();
       return taskEntity;

    }

    @Override
    public List getAllTaskList(int pageNumber, int pageSize) {

        Pageable pageable=PageRequest.of(pageNumber,pageSize,Sort.by(Sort.Direction.DESC,"taskKey"));
        List<TaskEntity> list=taskEntityDao.findAll(pageable).getContent();

        System.out.println(list);
        return list;
    }

    @Override
    public void deleteTask(TaskEntity taskEntity) {

        taskEntityDao.delete(taskEntity);

    }

    @Override
    public List getTaskListById(String id, int pageNumber, int pageSize) {
        Specification specification=new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Path path=root.get("id");
                Predicate predicate=criteriaBuilder.equal(path,id);
                return predicate;
            }
        };

        Pageable pageable=PageRequest.of(pageNumber,pageSize,Sort.by(Sort.Direction.DESC,"taskKey"));

        List list=taskEntityDao.findAll(specification,pageable).getContent();

        System.out.println(list);

        return list;
    }

    @Override
    public List getTaskListByProductName(String productName, int pageNumber, int pageSize) {
        Specification specification=new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Path path=root.get("productname");
                Predicate predicate=criteriaBuilder.equal(path,productName);
                return predicate;
            }
        };

        Pageable pageable=PageRequest.of(pageNumber,pageSize,Sort.by(Sort.Direction.DESC,"taskKey"));

        List list=taskEntityDao.findAll(specification,pageable).getContent();

        System.out.println(list);

        return list;
    }

    @Override
    public List getTaskListByWokOrder(String workOrder,int pageNumber, int pageSize) {
        Specification specification=new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Path path=root.get("workorder");
                Predicate predicate=criteriaBuilder.equal(path,workOrder);
                return predicate;
            }
        };

        Pageable pageable=PageRequest.of(pageNumber,pageSize,Sort.by(Sort.Direction.DESC,"taskKey"));

        List list=taskEntityDao.findAll(specification,pageable).getContent();

        System.out.println(list);

        return list;
    }

    @Override
    public List getTaskListBymaterialId(String materialId, int pageNumber, int pageSize) {
        Specification specification=new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Path path=root.get("materialid");
                Predicate predicate=criteriaBuilder.equal(path,materialId);
                return predicate;
            }
        };

        Pageable pageable=PageRequest.of(pageNumber,pageSize,Sort.by(Sort.Direction.DESC,"taskKey"));

        List list=taskEntityDao.findAll(specification,pageable).getContent();

        System.out.println(list);

        return list;
    }
}
