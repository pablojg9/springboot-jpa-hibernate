package com.pablo.project.spring.config;

import com.pablo.project.spring.entity.Order;
import com.pablo.project.spring.entity.User;
import com.pablo.project.spring.repository.OrderRepository;
import com.pablo.project.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(null, "Pablo", "pablojuniorgn2@gmail.com", "1323232", "132323");
        User user2 = new User(null, "Junior", "juniorgn2@gmail.com", "143232", "4240544");


        Order order1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), user1);
        Order order2 = new Order(null, Instant.parse("2019-06-20T03:23:07Z"), user2);
        Order order3 =  new Order(null, Instant.parse("2019-07-20T15:21:07Z"), user1);

        userRepository.saveAll(Arrays.asList(user1, user2));
        orderRepository.saveAll(Arrays.asList(order1, order2, order3));
    }
}
