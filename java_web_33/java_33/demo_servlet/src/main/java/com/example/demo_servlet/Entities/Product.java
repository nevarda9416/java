package com.example.demo_servlet.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Product {
    private String name;
    private int price;
    private String image;
    private int categoryId;
    private int status;

    public Product(String name, int price, String fileName, int categoryId, int i) {
        this.name = name;
        this.price = price;
        this.image = fileName;
        this.categoryId = categoryId;
        this.status = i;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", image='" + image + '\'' +
                ", categoryId=" + categoryId +
                ", status=" + status +
                '}';
    }
}
