package com.example.tddbudgetappbackend.DTO;
public class SubcategoryDTO {

    private String name;
    private Long categoryId;

//    public Subcategory toSubcategory(Category category) {
//        Subcategory subcategory = new Subcategory();
//        subcategory.setName(name);
//        subcategory.setCategory(category);
//        return subcategory;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
