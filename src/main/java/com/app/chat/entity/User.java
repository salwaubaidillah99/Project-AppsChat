package com.app.chat.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
public class User implements Serializable {
    @Id
    private String id;
    private String username;
    private String password;
    private String email;
    private String authority;
}
