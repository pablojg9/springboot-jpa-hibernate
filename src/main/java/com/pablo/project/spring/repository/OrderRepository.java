package com.pablo.project.spring.repository;

import com.pablo.project.spring.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
