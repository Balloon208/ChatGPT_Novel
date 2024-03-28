package com.chatgpt.chatgptapi.domain;


import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Embeddable
public class NovelID implements Serializable {
    public Integer user_id;
    public Integer novelbot_id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
}
