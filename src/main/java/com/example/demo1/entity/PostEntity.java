package com.example.demo1.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
public class PostEntity {

    // Getter & Setter (데이터 접근)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(nullable = false)
    private String name;

    @Setter
    @Column(nullable = false, unique = true)
    private String email;

    @Setter
    @Column(nullable = false)
    private String password;

    public PostEntity() {}

    public PostEntity(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

}


