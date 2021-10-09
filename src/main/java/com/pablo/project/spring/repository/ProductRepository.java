package com.pablo.project.spring.repository;

import com.pablo.project.spring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
