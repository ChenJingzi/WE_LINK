package com.cjz.welink.backend.module;

import java.util.List;
import java.util.Map;

public class IssueAndSectionMapDto {

    Map<String,Integer> map;
    List<IssueAndSectionDto>list;

    public IssueAndSectionMapDto(Map<String, Integer> map, List<IssueAndSectionDto> list) {
        this.map = map;
        this.list = list;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public List<IssueAndSectionDto> getList() {
        return list;
    }

    public void setList(List<IssueAndSectionDto> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "IssueAndSectionMapDto{" +
                "map=" + map +
                ", list=" + list +
                '}';
    }
}
