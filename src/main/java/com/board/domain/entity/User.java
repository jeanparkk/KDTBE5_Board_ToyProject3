package com.board.domain.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "id", length = 20)
    private String id;

    @Column(name = "username", length = 20, nullable = false)
    private String username;

    @Column(name = "password", length = 20, nullable = false)
    private String password;

    @Column(name = "email", length = 30, nullable = false)
    private String email;

    @Column(name = "nickname", length = 20, nullable = false)
    private String nickname;

    @Column(name = "role", length = 10, columnDefinition = "varchar(10) default '새싹회원'")
    private String role;

    @Column(name = "createdat", columnDefinition = "timestamp default current_timestamp")
    private Timestamp createdAt;

    @Column(name = "updatedat", columnDefinition = "timestamp default current_timestamp")
    private Timestamp updatedAt;

}