package com.shreyaJavaProj.Application.Automation.Repository;

import com.shreyaJavaProj.Application.Automation.entity.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JobRepository extends JpaRepository<Jobs, Long> {
    Optional<Jobs> findByHash(String hash);
}
