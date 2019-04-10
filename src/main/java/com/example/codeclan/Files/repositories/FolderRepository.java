package com.example.codeclan.Files.repositories;

import com.example.codeclan.Files.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
