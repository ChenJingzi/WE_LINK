package com.cjz.welink.backend.domain;

import javax.persistence.*;


@Table(name = "task")
@Entity
public class TaskEntity {

    @Column(name = "id")
    private String id="-";

    @Column(name = "productname")
    private String productname="-";

    @Column(name = "workorder")
    private String workorder="-";

    @Column(name = "materialid")
    private String materialid="-";

    @Column(name = "starttime")
    private String starttime="-";

    @Column(name = "endtime")
    private String endtime="-";

    @Column(name = "status")
    private String status="-";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="task_key")
    private int taskKey;

    @Column(name = "task_spend_time")
    private int taskspendtime=0;

    @Override
    public String toString() {
        return "TaskEntity{" +
                "id='" + id + '\'' +
                ", productname='" + productname + '\'' +
                ", workorder='" + workorder + '\'' +
                ", materialid='" + materialid + '\'' +
                ", starttime='" + starttime + '\'' +
                ", endtime='" + endtime + '\'' +
                ", status='" + status + '\'' +
                ", taskkey=" + taskKey +
                ", taskspendtime=" + taskspendtime +
                '}';
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

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTaskkey() {
        return taskKey;
    }

    public void setTaskkey(int taskkey) {
        this.taskKey = taskkey;
    }

    public int getTaskspendtime() {
        return taskspendtime;
    }

    public void setTaskspendtime(int taskspendtime) {
        this.taskspendtime = taskspendtime;
    }
}
