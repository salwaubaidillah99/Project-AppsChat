package com.app.chat.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
public class RoomChat implements Serializable {
    @Id
    private String id;
    private String chatId;
    private String senderId;
    private String receiverId;

}
