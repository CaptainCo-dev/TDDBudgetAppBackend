package com.example.tddbudgetappbackend.Service;

import com.example.tddbudgetappbackend.DTO.CategoryDTO;
import com.example.tddbudgetappbackend.Model.Category;
import com.example.tddbudgetappbackend.Repository.CategoryRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.*;

@ContextConfiguration(classes = {CategoryServiceImpl.class})
@ExtendWith(SpringExtension.class)
public class CategoryServiceImplTest {

    @MockBean
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryServiceImpl categoryServiceImpl;

    /**
     * Tests the addCategory functionality
     */
    @Test
    void testAddCategory() {
        Category category = new Category();
        category.setCategory_id(1L);
        category.setName("Category A");
        category.setSubcategories(new ArrayList<>());

        when(categoryRepository.save(any())).thenReturn(category);
        assertSame(category, categoryServiceImpl.addCategory(new CategoryDTO()));
        verify(categoryRepository).save((Category) any());
    }
}