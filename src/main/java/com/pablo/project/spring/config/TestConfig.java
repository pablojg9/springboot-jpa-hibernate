package com.pablo.project.spring.config;

import com.pablo.project.spring.entity.User;
import com.pablo.project.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(null, "Pablo", "pablojuniorgn2@gmail.com", "1323232", "132323");
        User user2 = new User(null, "Junior", "juniorgn2@gmail.com", "143232", "4240544");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
