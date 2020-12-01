package com.cjz.welink.backend.module;

import com.cjz.welink.backend.domain.TaskEntity;
import com.cjz.welink.backend.module.IssueAndSectionDto;

import java.util.List;
import java.util.Map;

public class TaskAndProductMapClass {

    List<TaskEntity> taskList;
    Map<String,Integer> taskMap;

    @Override
    public String toString() {
        return "TaskAndProductMapClass{" +
                "taskList=" + taskList +
                ", taskMap=" + taskMap +
                '}';
    }

    public TaskAndProductMapClass(List<TaskEntity> taskList, Map<String, Integer> taskMap) {
        this.taskList = taskList;
        this.taskMap = taskMap;
    }

    public List<TaskEntity> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<TaskEntity> taskList) {
        this.taskList = taskList;
    }

    public Map<String, Integer> getTaskMap() {
        return taskMap;
    }

    public void setTaskMap(Map<String, Integer> taskMap) {
        this.taskMap = taskMap;
    }
}
