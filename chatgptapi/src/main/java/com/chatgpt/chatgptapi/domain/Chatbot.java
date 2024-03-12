package com.chatgpt.chatgptapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Chatbot {
    @Id
    public int logid;
    @Column
    public String chatlog;
}
