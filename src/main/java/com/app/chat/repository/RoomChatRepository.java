package com.app.chat.repository;

import com.app.chat.entity.RoomChat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomChatRepository extends JpaRepository<RoomChat, String> {
}
