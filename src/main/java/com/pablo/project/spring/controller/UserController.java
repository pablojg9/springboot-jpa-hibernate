package com.pablo.project.spring.controller;

import com.pablo.project.spring.entity.User;
import com.pablo.project.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping()
    public ResponseEntity<User> findAll() {

        User user = new User(null, "pablo", "pablo@gmail.com", "1222222", "1234");

        return ResponseEntity.ok().body(user);

    }


}
