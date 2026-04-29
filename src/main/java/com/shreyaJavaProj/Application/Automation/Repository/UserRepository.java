package com.shreyaJavaProj.Application.Automation.Repository;

import com.shreyaJavaProj.Application.Automation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
