package com.example.tddbudgetappbackend.DTO;

import com.example.tddbudgetappbackend.Model.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryDTOTest {

    @Test
    void usageTest_toCategory() {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setName("Test");
        Category category = categoryDTO.toCategory();
        Assertions.assertEquals("", category);
    }
}