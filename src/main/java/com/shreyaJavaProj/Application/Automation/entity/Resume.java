package com.shreyaJavaProj.Application.Automation.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;
@Data
@Entity
@Table(name = "resumes")
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    @Lob
    @Column(name = "original_text")
    private String originalText;

    @Column(name = "parsed_json", columnDefinition = "jsonb")
    private String parsedJson;

    @Column(nullable = false, updatable = false)
    private Instant createdAt = Instant.now();

    // getters/setters
}
