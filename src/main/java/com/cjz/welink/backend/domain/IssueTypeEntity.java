package com.cjz.welink.backend.domain;

import javax.persistence.*;

@Entity
@Table(name = "issuetype")
public class IssueTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "issuetype_code")
    private String issueTypeCode;

    @Column(name = "issuetype_desc")
    private String issueTypeDesc;

    @Override
    public String toString() {
        return "IssueTypeEntity{" +
                "issueTypeCode='" + issueTypeCode + '\'' +
                ", issueTypeDesc='" + issueTypeDesc + '\'' +
                '}';
    }

    public String getIssueTypeCode() {
        return issueTypeCode;
    }

    public void setIssueTypeCode(String issueTypeCode) {
        this.issueTypeCode = issueTypeCode;
    }

    public String getIssueTypeDesc() {
        return issueTypeDesc;
    }

    public void setIssueTypeDesc(String issueTypeDesc) {
        this.issueTypeDesc = issueTypeDesc;
    }
}
