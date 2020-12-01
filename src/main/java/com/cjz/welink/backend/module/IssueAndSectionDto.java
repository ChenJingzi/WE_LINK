package com.cjz.welink.backend.module;

public class IssueAndSectionDto {


    private String id;

    private String productname;

    private String workorder;

    private String materialid;

    private String issuetype;

    private String issuestarttime;

    private int issuespendtime;

    private String issuefihishtime;

    private String status;

    private String reason;

    private String issue_actual_finishtime;

    private int issue_count;

    private String Issue_solved_person;

    private String getIssue_solved_method;

    private int task_key;

    private String department;

    private String issue_need_day;

    private String section;

    public IssueAndSectionDto(String id, String productname, String workorder, String materialid, String issuetype, String issuestarttime, int issuespendtime, String issuefihishtime, String status, String reason, String issue_actual_finishtime, int issue_count, String issue_solved_person, String getIssue_solved_method, int task_key, String department, String issue_need_day, String section) {
        this.id = id;
        this.productname = productname;
        this.workorder = workorder;
        this.materialid = materialid;
        this.issuetype = issuetype;
        this.issuestarttime = issuestarttime;
        this.issuespendtime = issuespendtime;
        this.issuefihishtime = issuefihishtime;
        this.status = status;
        this.reason = reason;
        this.issue_actual_finishtime = issue_actual_finishtime;
        this.issue_count = issue_count;
        Issue_solved_person = issue_solved_person;
        this.getIssue_solved_method = getIssue_solved_method;
        this.task_key = task_key;
        this.department = department;
        this.issue_need_day = issue_need_day;
        this.section = section;
    }

    @Override
    public String toString() {
        return "IssueAndSectionDto{" +
                "id='" + id + '\'' +
                ", productname='" + productname + '\'' +
                ", workorder='" + workorder + '\'' +
                ", materialid='" + materialid + '\'' +
                ", issuetype='" + issuetype + '\'' +
                ", issuestarttime='" + issuestarttime + '\'' +
                ", issuespendtime=" + issuespendtime +
                ", issuefihishtime='" + issuefihishtime + '\'' +
                ", status='" + status + '\'' +
                ", reason='" + reason + '\'' +
                ", issue_actual_finishtime='" + issue_actual_finishtime + '\'' +
                ", issue_count=" + issue_count +
                ", Issue_solved_person='" + Issue_solved_person + '\'' +
                ", getIssue_solved_method='" + getIssue_solved_method + '\'' +
                ", task_key=" + task_key +
                ", department='" + department + '\'' +
                ", issue_need_day='" + issue_need_day + '\'' +
                ", section='" + section + '\'' +
                '}';
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getWorkorder() {
        return workorder;
    }

    public void setWorkorder(String workorder) {
        this.workorder = workorder;
    }

    public String getMaterialid() {
        return materialid;
    }

    public void setMaterialid(String materialid) {
        this.materialid = materialid;
    }

    public String getIssuetype() {
        return issuetype;
    }

    public void setIssuetype(String issuetype) {
        this.issuetype = issuetype;
    }

    public String getIssuestarttime() {
        return issuestarttime;
    }

    public void setIssuestarttime(String issuestarttime) {
        this.issuestarttime = issuestarttime;
    }

    public int getIssuespendtime() {
        return issuespendtime;
    }

    public void setIssuespendtime(int issuespendtime) {
        this.issuespendtime = issuespendtime;
    }

    public String getIssuefihishtime() {
        return issuefihishtime;
    }

    public void setIssuefihishtime(String issuefihishtime) {
        this.issuefihishtime = issuefihishtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getIssue_actual_finishtime() {
        return issue_actual_finishtime;
    }

    public void setIssue_actual_finishtime(String issue_actual_finishtime) {
        this.issue_actual_finishtime = issue_actual_finishtime;
    }

    public int getIssue_count() {
        return issue_count;
    }

    public void setIssue_count(int issue_count) {
        this.issue_count = issue_count;
    }

    public String getIssue_solved_person() {
        return Issue_solved_person;
    }

    public void setIssue_solved_person(String issue_solved_person) {
        Issue_solved_person = issue_solved_person;
    }

    public String getGetIssue_solved_method() {
        return getIssue_solved_method;
    }

    public void setGetIssue_solved_method(String getIssue_solved_method) {
        this.getIssue_solved_method = getIssue_solved_method;
    }

    public int getTask_key() {
        return task_key;
    }

    public void setTask_key(int task_key) {
        this.task_key = task_key;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getIssue_need_day() {
        return issue_need_day;
    }

    public void setIssue_need_day(String issue_need_day) {
        this.issue_need_day = issue_need_day;
    }
}
