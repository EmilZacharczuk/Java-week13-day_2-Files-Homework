package com.example.codeclan.Files.repositories;

import com.example.codeclan.Files.models.File;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FileRepository extends JpaRepository<File, Long> {
}
