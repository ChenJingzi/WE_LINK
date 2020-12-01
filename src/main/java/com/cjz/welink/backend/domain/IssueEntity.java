package com.cjz.welink.backend.domain;


import javax.persistence.*;

@Table(name="issue")
@Entity
public class IssueEntity {

    @Column(name = "id")
    private String id="-";

    @Column(name = "productname")
    private String productname="-";

    @Column(name = "workorder")
    private String workorder="-";

    @Column(name = "materialid")
    private String materialid="-";

    @Column(name = "issuetype")
    private String issuetype="-";

    @Column(name = "issuestarttime")
    private String issuestarttime="-";

    @Column(name = "issuespendtime")
    private int issuespendtime=0;

    @Column(name = "issuefinishtime")
    private String issuefihishtime="-";

    @Column(name = "status")
    private String status="-";

    @Column(name = "reason")
    private String reason="-";

    @Column(name = "issue_actual_finishtime")
    private String issue_actual_finishtime="-";

    @Column(name = "issue_count")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int issueCount;

    @Column(name = "issue_solved_person")
    private String Issue_solved_person="-";

    @Column(name = "issue_solved_method")
    private String getIssue_solved_method="-";

    @Column(name = "task_key")
    private int task_key;

    @Column(name = "department",insertable = false,updatable = false)
    private String department="-";

    @Column(name = "issue_need_day")
    private String issue_need_day="-";


    @ManyToOne(targetEntity = DepartmentEntity.class)
    @JoinColumn(name = "department",referencedColumnName = "name")
    private DepartmentEntity departmentEntity;


    @Override
    public String toString() {
        return "IssueEntity{" +
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
                ", issue_count=" + issueCount +
                ", Issue_solved_person='" + Issue_solved_person + '\'' +
                ", getIssue_solved_method='" + getIssue_solved_method + '\'' +
                ", task_key=" + task_key +
                ", department='" + department + '\'' +
                ", issue_need_day='" + issue_need_day + '\'' +
                '}';
    }

    public DepartmentEntity getDepartmentEntity() {
        return departmentEntity;
    }

    public void setDepartmentEntity(DepartmentEntity departmentEntity) {
        this.departmentEntity = departmentEntity;
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
        return issueCount;
    }

    public void setIssue_count(int issue_count) {
        this.issueCount = issueCount;
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
