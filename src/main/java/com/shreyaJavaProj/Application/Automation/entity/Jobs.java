package com.shreyaJavaProj.Application.Automation.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;
@Data
@Entity
@Table(
        name = "jobs",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_jobs_hash", columnNames = {"hash"})
        }
)
public class Jobs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "source_id")
    private JobSource source;

    @Column(name = "external_id")
    private String externalId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String company;

    private String location;

    @Lob
    private String description;

    @Column(nullable = false)
    private String url;

    @Column(nullable = false)
    private String hash; // sha256(title+company+location)

    @Column(nullable = false, updatable = false)
    private Instant createdAt = Instant.now();

    // getters/setters
}
