package com.cjz.welink.backend.domain;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "password")
    private int password;

    @Column(name = "status")
    private String status;

    @Column(name = "number")
    private int number;

    @Column(name = "netease_mail_key",updatable = false,insertable = false)
    private int neteaseMailKey;



    @Override
    public String toString() {
        return "UserEntity{" +
                "id='" + id + '\'' +
                ", password=" + password +
                ", status='" + status + '\'' +
                ", number=" + number +
                ", neteaseMailKey=" + neteaseMailKey +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNeteaseMailKey() {
        return neteaseMailKey;
    }

    public void setNeteaseMailKey(int neteaseMailKey) {
        this.neteaseMailKey = neteaseMailKey;
    }


}
