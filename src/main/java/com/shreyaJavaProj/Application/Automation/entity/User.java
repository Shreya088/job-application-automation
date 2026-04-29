package com.shreyaJavaProj.Application.Automation.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;

@Data
    @Entity
    @Table(name = "users")
    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private String name;

        @Column(nullable = false, unique = true)
        private String email;

        @Column(nullable = false, updatable = false)
        private Instant createdAt = Instant.now();


    }


