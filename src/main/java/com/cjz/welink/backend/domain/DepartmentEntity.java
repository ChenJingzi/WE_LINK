package com.cjz.welink.backend.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Table(name = "department")
@Entity
public class DepartmentEntity {

    @Column(name = "name")
    @Id
    private String name;

    @Column(name = "section")
    private String section;

    @Column(name = "chinese_name")
    private String chinese_name;

    @Column(name = "mail_address")
    private String mail_address;

    @OneToMany(mappedBy = "departmentEntity",cascade = CascadeType.ALL,fetch =FetchType.EAGER )
    private Set<IssueEntity> issueEntitySet=new HashSet<>();

    @Override
    public String toString() {
        return "DepartmentEntity{" +
                "name='" + name + '\'' +
                ", section='" + section + '\'' +
                ", chinese_name='" + chinese_name + '\'' +
                ", mail_address='" + mail_address + '\'' +
                '}';
    }

    public Set<IssueEntity> getIssueEntitySet() {
        return issueEntitySet;
    }

    public void setIssueEntitySet(Set<IssueEntity> issueEntitySet) {
        this.issueEntitySet = issueEntitySet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getChinese_name() {
        return chinese_name;
    }

    public void setChinese_name(String chinese_name) {
        this.chinese_name = chinese_name;
    }

    public String getMail_address() {
        return mail_address;
    }

    public void setMail_address(String mail_address) {
        this.mail_address = mail_address;
    }
}
