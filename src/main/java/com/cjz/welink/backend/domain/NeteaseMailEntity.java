package com.cjz.welink.backend.domain;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "netease_Mail")
public class NeteaseMailEntity {

    @Column(name = "mail_address")
    private String  mailAddress;

    @Column(name = "mailPassword")
    private String mailPassword;

    @Id
    @Column(name = "netease_mail_key")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int neteaseMailKey;

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getMailPassword() {
        return mailPassword;
    }

    public void setMailPassword(String mailPassword) {
        this.mailPassword = mailPassword;
    }

    public int getNeteaseMailKey() {
        return neteaseMailKey;
    }

    public void setNeteaseMailKey(int neteaseMailKey) {
        this.neteaseMailKey = neteaseMailKey;
    }

    @Override
    public String toString() {
        return "NeteaseMailEntity{" +
                "mailAddress='" + mailAddress + '\'' +
                ", mailPassword='" + mailPassword + '\'' +
                ", neteaseMailKey=" + neteaseMailKey +
                '}';
    }

}
