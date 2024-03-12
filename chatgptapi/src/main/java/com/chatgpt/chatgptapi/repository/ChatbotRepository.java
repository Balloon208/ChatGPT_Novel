package com.chatgpt.chatgptapi.repository;

import com.chatgpt.chatgptapi.domain.Chatbot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatbotRepository extends JpaRepository<Chatbot, String> {
}
