package com.example.tddbudgetappbackend.Service;

import com.example.tddbudgetappbackend.DTO.CategoryDTO;
import com.example.tddbudgetappbackend.Model.Category;
import com.example.tddbudgetappbackend.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category addCategory(CategoryDTO categoryDTO) {
        Category category = categoryDTO.toCategory();
        return categoryRepository.save(category);
    }
}
