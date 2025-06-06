package com.example.chatserver.chat.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatRoomResponseDto {

    private Long roomId;
    private String roomName;
    private Boolean isPrivate;
    private LocalDateTime createdAt;
}
