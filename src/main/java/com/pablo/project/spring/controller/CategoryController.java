package com.pablo.project.spring.controller;

import com.pablo.project.spring.entity.Category;
import com.pablo.project.spring.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/categorys")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {

        List<Category> categoryList = categoryService.findAll();

        return ResponseEntity.ok().body(categoryList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {

        Category category = categoryService.findById(id);

        return ResponseEntity.ok().body(category);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id) {
        categoryService.deleteById(id);

        return ResponseEntity.ok().body("Deletado com sucesso!");
    }

}
