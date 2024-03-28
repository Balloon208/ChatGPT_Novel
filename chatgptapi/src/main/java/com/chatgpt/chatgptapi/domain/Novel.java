package com.chatgpt.chatgptapi.domain;

import com.chatgpt.chatgptapi.controller.dto.ChatbotResponseDto;

import java.sql.Date;

public class Novel {
    public Integer user_id;
    public Integer novelbot_id;
    public String id;
    public String contents;
    public Date createtime;
}
