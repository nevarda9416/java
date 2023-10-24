package com.example.demo_servlet.Services;

import com.example.demo_servlet.Entities.Category;
import com.example.demo_servlet.Repositories.CategoryRepository;

import java.util.List;

public class CategoryService {
    CategoryRepository categoryRepository = new CategoryRepository();

    public List<Category> getAll() {
        return categoryRepository.getAll();
    }

    public boolean add(Category category) {
        return categoryRepository.add(category);
    }
}
