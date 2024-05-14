package com.app.chat.entity;

import com.app.chat.model.ModelMessageStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class Chat implements Serializable {
    @Id
    private String id;
    private String chatId;
    private String senderId;
    private String senderName;
    private String reciverId;
    private String receiverName;
    private String content;
    @Enumerated(EnumType.STRING)
    private ModelMessageStatus modelMessageStatus;
    private Date createAt;


}
