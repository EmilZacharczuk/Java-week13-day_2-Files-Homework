package com.example.codeclan.Files.repositories;

import com.example.codeclan.Files.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
