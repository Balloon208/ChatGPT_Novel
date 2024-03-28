package com.chatgpt.chatgptapi.repository;

import com.chatgpt.chatgptapi.domain.Novelbot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatbotRepository extends JpaRepository<Novelbot, String> {
}
