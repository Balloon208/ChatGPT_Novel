package com.chatgpt.chatgptapi.config;

import org.springframework.beans.factory.annotation.Value;

public class ChatbotConfig {
    public static final String AUTHORIZATION = "Authorization";
    public static final String BEARER = "Bearer ";

    public static String API_KEY;

    @Value("${chatbot.api_key}")
    public void setApiKey(String apiKey) {
        API_KEY = apiKey;
    }

    public static final String MODEL = "gpt-3.5-turbo";
    public static final Integer MAX_TOKEN = 3000;
    public static final Double TEMPERATURE = 0.0;
    public static final String URL = "https://api.openai.com/v1/chat/completions";
}
