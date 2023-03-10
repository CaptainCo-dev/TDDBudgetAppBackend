package com.example.tddbudgetappbackend.DTO;


import com.example.tddbudgetappbackend.Model.Category;

public class CategoryDTO {

    private String name;

    public Category toCategory() {
        Category category = new Category();
        category.setName(name);
        return category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

