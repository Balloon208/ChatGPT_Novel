package com.chatgpt.chatgptapi.service;


import com.chatgpt.chatgptapi.config.ChatbotConfig;
import com.chatgpt.chatgptapi.controller.dto.ChatbotRequestDto;
import com.chatgpt.chatgptapi.controller.dto.ChatbotResponseDto;
import com.chatgpt.chatgptapi.controller.dto.QuestionRequestDto;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ChatbotService {
    private static RestTemplate restTemplate = new RestTemplate();

    public HttpEntity<ChatbotRequestDto> buildHttpEntity(ChatbotRequestDto requestDto){
        HttpHeaders headers = new HttpHeaders();
        headers.add(ChatbotConfig.AUTHORIZATION, ChatbotConfig.BEARER + ChatbotConfig.API_KEY);
        return new HttpEntity<>(requestDto, headers);
    }

    public ChatbotResponseDto getResponse(HttpEntity<ChatbotRequestDto> chatbotRequestDtoHttpEntity){
        ResponseEntity<ChatbotResponseDto> responseEntity = restTemplate.postForEntity(
                ChatbotConfig.URL,
                chatbotRequestDtoHttpEntity,
                ChatbotResponseDto.class
        );

        return responseEntity.getBody();
    }

    public ChatbotResponseDto Sendquery(QuestionRequestDto requestDto) {
        List<Map<String, String>> messages = new ArrayList<>();
        messages.add(Map.of("role", "system", "content", "너는 지금부터 내가 적어주는 단어들과 관련된 소설을 써야해."));
        messages.add(Map.of("role", "user", "content", requestDto.getContent()));

        return this.getResponse(
                this.buildHttpEntity(
                        new ChatbotRequestDto(
                                ChatbotConfig.MODEL,
                                messages,
                                ChatbotConfig.MAX_TOKEN,
                                ChatbotConfig.TEMPERATURE
                        )
                )
        );
    }
}
