package com.shreyaJavaProj.Application.Automation.Repository;

import com.shreyaJavaProj.Application.Automation.entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ResumeRepository extends JpaRepository<Resume, Long> {
    Optional<Resume> findByUserId(Long userId);
}