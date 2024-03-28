package com.chatgpt.chatgptapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    public Integer id;

    @Column
    public String name;
    @Column
    public String loginid;
    @Column
    public String password;
}