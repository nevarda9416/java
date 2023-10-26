package com.example.demo_servlet.Repositories;

import com.example.demo_servlet.Entities.Product;
import com.example.demo_servlet.Utils.DBContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();
        DBContext context = new DBContext();
        Connection connection = context.openConnection();
        String sql = "SELECT * FROM products";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Product product = new Product();
                product.setName(resultSet.getString("name"));
                product.setStatus(resultSet.getInt("price"));
                product.setName(resultSet.getString("image"));
                product.setStatus(resultSet.getInt("category_id"));
                product.setStatus(resultSet.getInt("status"));
                products.add(product);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return products;
    }

    public boolean add(Product product) {
        DBContext context = new DBContext();
        Connection connection = context.openConnection();
        String sql = "INSERT INTO products(name, price, image, category_id, status) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setInt(2, Integer.parseInt(product.getPrice()));
            preparedStatement.setString(3, product.getImage());
            preparedStatement.setInt(4, product.getCategoryId());
            preparedStatement.setInt(5, 1);
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }
}
