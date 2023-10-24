package com.example.demo_servlet.DTO;

import com.example.demo_servlet.Entities.SubCategory;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CategoryDTO {
    private int id;
    private String name;
    private int status;
    private List<SubCategory> subCategoryList = new ArrayList<>();

    public CategoryDTO() {
    }

    public CategoryDTO(int id, String name, int status, List<SubCategory> subCategoryList) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.subCategoryList = subCategoryList;
    }
}
