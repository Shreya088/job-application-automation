package com.shreyaJavaProj.Application.Automation.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "job_sources")
public class JobSource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;       // linkedin, naukri, etc

    @Column(name = "base_url")
    private String baseUrl;

    // getters/setters
}
