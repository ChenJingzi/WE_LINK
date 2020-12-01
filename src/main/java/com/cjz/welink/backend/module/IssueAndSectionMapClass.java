package com.cjz.welink.backend.module;

import com.cjz.welink.backend.domain.TaskEntity;
import com.cjz.welink.backend.module.IssueAndSectionDto;

import java.util.List;
import java.util.Map;

public class IssueAndSectionMapClass {

    List<IssueAndSectionDto> issueList;
    Map<String,Integer> issueMap;

    @Override
    public String toString() {
        return "IssueAndSectionMapClass{" +
                "issueList=" + issueList +
                ", issueMap=" + issueMap +
                '}';
    }

    public List<IssueAndSectionDto> getIssueList() {
        return issueList;
    }

    public void setIssueList(List<IssueAndSectionDto> issueList) {
        this.issueList = issueList;
    }

    public Map<String, Integer> getIssueMap() {
        return issueMap;
    }

    public void setIssueMap(Map<String, Integer> issueMap) {
        this.issueMap = issueMap;
    }

    public IssueAndSectionMapClass(List<IssueAndSectionDto> issueList, Map<String, Integer> issueMap) {
        this.issueList = issueList;
        this.issueMap = issueMap;
    }
}
