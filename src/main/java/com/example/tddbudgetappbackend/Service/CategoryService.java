package com.example.tddbudgetappbackend.Service;


import com.example.tddbudgetappbackend.DTO.CategoryDTO;
import com.example.tddbudgetappbackend.Model.Category;

public interface CategoryService {
    public Category addCategory(CategoryDTO categoryDTO);
}
