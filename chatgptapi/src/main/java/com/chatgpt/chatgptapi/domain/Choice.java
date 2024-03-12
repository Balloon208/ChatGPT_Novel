package com.chatgpt.chatgptapi.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Choice {
    @JsonProperty("message")
    private Message message;
    private Integer index;
    @JsonProperty("finish_reason")
    private String finishReason;

    @Builder
    public Choice(Message message, Integer index, String finishReason) {
        this.message = message;
        this.index = index;
        this.finishReason = finishReason;
    }

    @Getter
    @NoArgsConstructor
    public static class Message {
        private String content;
        private String role;

        @Builder
        public Message(String content, String role) {
            this.content = content;
            this.role = role;
        }
    }
}
