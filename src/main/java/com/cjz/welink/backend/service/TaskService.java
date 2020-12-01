package com.cjz.welink.backend.service;

import com.cjz.welink.backend.domain.TaskEntity;
import com.cjz.welink.backend.module.TaskAndProductMapClass;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskService {

     //所有查询默认使用taskkey倒序

     TaskAndProductMapClass getDoingTaskAndProduct();

     int insertAndUpdateTask(TaskEntity taskEntity);

     void deleteTask(TaskEntity taskEntity);


     //查询

     List getAllTaskList(int pageNumber,int pageSize);

     List getTaskListById(String id,int pageNumber, int pageSize);

     List getTaskListByProductName(String productName,int pageNumber, int pageSize);

     List getTaskListByWokOrder(String workOrder,int pageNumber, int pageSize);

     List getTaskListBymaterialId(String materialId,int pageNumber, int pageSize);

     List getTaskListByStatus(String status,int pageNumber, int pageSize);

     //查询单个员工正在进行的工作
     TaskEntity getDoingTaskById(String id);

}
