package com.example.demo_servlet.Repositories;

import com.example.demo_servlet.Entities.SubCategory;
import com.example.demo_servlet.Utils.DBContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SubCategoryRepository {
    public List<SubCategory> getAll() {
        List<SubCategory> subCategories = new ArrayList<>();
        DBContext context = new DBContext();
        Connection connection = context.openConnection();
        String sql = "SELECT * FROM subcategories";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                SubCategory subCategory = new SubCategory();
                subCategory.setId(resultSet.getInt("id"));
                subCategory.setName(resultSet.getString("name"));
                subCategory.setCategoryId(resultSet.getInt("category_id"));
                subCategories.add(subCategory);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return subCategories;
    }

    public boolean add(SubCategory subCategory) {
        DBContext context = new DBContext();
        Connection connection = context.openConnection();
        String sql = "INSERT INTO sub_category(name, category_id) VALUES (?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, subCategory.getName());
            preparedStatement.setInt(2, subCategory.getCategoryId());
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }
}
