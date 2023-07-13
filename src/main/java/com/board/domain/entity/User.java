package com.board.domain.entity;


import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "user")
@ToString
public class User {
    @Id
    @GeneratedValue
    private long id;
    private String userName;
    private String password;
    private String email;
    private String nickname;
    private String role;
    private Timestamp createdAt;
    private Timestamp updatedAt;

}