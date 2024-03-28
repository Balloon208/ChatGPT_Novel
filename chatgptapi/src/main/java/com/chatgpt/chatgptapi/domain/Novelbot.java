package com.chatgpt.chatgptapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Novelbot {
    @Id
    public Integer id;
    @Column
    public String name;

    @Column
    public String version;
}
