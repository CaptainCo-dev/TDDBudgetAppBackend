package com.example.tddbudgetappbackend.Controller;

import com.example.tddbudgetappbackend.DTO.CategoryDTO;
import com.example.tddbudgetappbackend.Model.Category;
import com.example.tddbudgetappbackend.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @PostMapping("/categories")
    public Category addCategory(@RequestBody CategoryDTO categoryDTO) {
        return categoryService.addCategory(categoryDTO);
    }

//    @GetMapping("/categories")
//    public List<Category> getAllCategories() {
//        return categoryService.getAllCategories();
//    }
}