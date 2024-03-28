package com.chatgpt.chatgptapi.controller;

import com.chatgpt.chatgptapi.controller.dto.ChatbotResponseDto;
import com.chatgpt.chatgptapi.controller.dto.QuestionRequestDto;
import com.chatgpt.chatgptapi.service.ChatbotService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chatbot")
public class ChatbotController {
    private final ChatbotService chatbotService;

    public ChatbotController(ChatbotService chatbotService){
        this.chatbotService = chatbotService;
    }

    @PostMapping("/query")
    public ChatbotResponseDto sendQuestion(@RequestBody QuestionRequestDto requestDto)
    {
        ChatbotResponseDto result = chatbotService.Sendquery(requestDto);
        // chatbotService.save(result);
        return result;
    }
}
