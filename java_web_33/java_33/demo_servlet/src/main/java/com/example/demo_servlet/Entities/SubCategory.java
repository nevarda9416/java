package com.example.demo_servlet.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SubCategory {
    private int id;
    private String name;
    private int categoryId;
    private int status;

    public SubCategory(String name, int categoryId, int i) {
    }
}
