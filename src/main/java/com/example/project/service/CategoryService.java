package com.example.project.service;

import com.example.project.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    void addCategory(Category category);
    List<Category> listCategory();
    void deleteCategory(long categoryId);
    void updateCategory(Category category);
    Optional<Category> getCategory(long categoryId);

}

