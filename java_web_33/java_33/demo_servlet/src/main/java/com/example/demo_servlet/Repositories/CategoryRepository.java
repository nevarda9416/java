package com.example.demo_servlet.Repositories;

import com.example.demo_servlet.Entities.Category;
import com.example.demo_servlet.Utils.DBContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository {
    public List<Category> getAll() {
        List<Category> categories = new ArrayList<>();
        DBContext context = new DBContext();
        Connection connection = context.openConnection();
        String sql = "SELECT * FROM categories";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Category category = new Category();
                category.setId(resultSet.getInt("id"));
                category.setName(resultSet.getString("name"));
                category.setStatus(resultSet.getInt("status"));
                categories.add(category);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return categories;
    }

    public boolean add(Category category) {
        DBContext context = new DBContext();
        Connection connection = context.openConnection();
        String sql = "INSERT INTO Category(name, status) VALUES (?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, category.getName());
            preparedStatement.setInt(2, category.getStatus());
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }
}
