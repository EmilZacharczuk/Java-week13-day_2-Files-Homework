package com.example.codeclan.Files.components;

import com.example.codeclan.Files.models.File;
import com.example.codeclan.Files.models.Folder;
import com.example.codeclan.Files.models.User;
import com.example.codeclan.Files.repositories.FileRepository;
import com.example.codeclan.Files.repositories.FolderRepository;
import com.example.codeclan.Files.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public void run(ApplicationArguments args) {
        User user1 = new User("Johny");
        userRepository.save(user1);

        User user2 = new User("George");
        userRepository.save(user2);

        Folder folder1 = new Folder("main", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("data", user2);
        folderRepository.save(folder2);

        File file1 = new File("Main", "doc", 5.60, folder1);
        fileRepository.save(file1);

        File file2 = new File("Text", "doc", 6.50, folder2);
        fileRepository.save(file2);


        user1.addFolder(folder1);
        user1.addFolder(folder2);
        userRepository.save(user1);

        folder1.addFiles(file1);
        folder1.addFiles(file2);
        folderRepository.save(folder1);

    }
}
