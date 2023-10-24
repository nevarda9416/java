package com.example.demo_servlet.Services;

import com.example.demo_servlet.Entities.SubCategory;
import com.example.demo_servlet.Repositories.SubCategoryRepository;

import java.util.List;

public class SubCategoryService {
    SubCategoryRepository subCategoryRepository = new SubCategoryRepository();
    public List<SubCategory> getAll() {
        return subCategoryRepository.getAll();
    }

    public void add(SubCategory subCategory) {
    }
}
