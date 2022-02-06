package com.rest.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Builder
@Entity
@Table(name = "user")
public class User {
    @Id // primaryKey임을 알립니다.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //  pk생성전략을 DB에 위임한다는 의미입니다. mysql로 보면 pk 필드를 auto_increment로 설정해 놓은 경우로 보면 됩니다.
    private long msrl;
    @Column(nullable = false, unique = true, length = 30) // uid column을 명시합니다. 필수이고 유니크한 필드이며 길이는 30입니다.
    private String uid;
    @Column(nullable = false, length = 100) // name column을 명시합니다. 필수이고 길이는 100입니다.
    private String name;

    public User() {}

    public User(String uid, String name) {
        this.uid = uid;
        this.name = name;
    }

    public long getMsrl() {
        return msrl;
    }

    public void setMsrl(long msrl) {
        this.msrl = msrl;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
