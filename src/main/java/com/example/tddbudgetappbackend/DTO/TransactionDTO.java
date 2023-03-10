package com.example.tddbudgetappbackend.DTO;

import java.time.LocalDate;

public class TransactionDTO {
    private Double amount;

    private String name;
    private Long categoryId;
    private Long subcategoryId;
    private LocalDate date;

//    public Transaction toTransaction(Category category, Subcategory subcategory) {
//        Transaction transaction = new Transaction();
//        transaction.setAmount(amount);
//        transaction.setName(name);
//        transaction.setCategory(category);
//        transaction.setSubcategory(subcategory);
//        transaction.setDate(date);
//        return transaction;
//    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(Long subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

