package com.chatgpt.chatgptapi.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Getter
public class ChatbotRequestDto {
    private String model;
    private List<Map<String, String>> messages;
    @JsonProperty("max_tokens")
    private Integer maxTokens;
    private Double temperature;

    @Builder

    public ChatbotRequestDto(String model, List<Map<String, String>> messages, Integer maxTokens, Double temperature) {
        this.model = model;
        this.messages = messages;
        this.maxTokens = maxTokens;
        this.temperature = temperature;
    }
}
