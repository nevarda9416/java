package com.example.demo_servlet.Repositories;

import com.example.demo_servlet.Entities.Product;
import com.example.demo_servlet.Utils.DBContext;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    public List<Product> getAll() throws SQLException {
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
                product.setPrice(resultSet.getInt("price"));
                product.setImage(resultSet.getString("image"));
                product.setCategoryId(resultSet.getInt("category_id"));
                product.setStatus(resultSet.getInt("status"));
                products.add(product);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        connection.close();
        return products;
    }

    public boolean add(Product product) throws SQLException {
        DBContext context = new DBContext();
        Connection connection = context.openConnection();
        String sql = "INSERT INTO products(name, price, image, category_id, status) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setInt(2, product.getPrice());
            preparedStatement.setString(3, product.getImage());
            preparedStatement.setInt(4, product.getCategoryId());
            preparedStatement.setInt(5, 1);
            preparedStatement.executeUpdate();
            connection.close();
            return true;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            connection.close();
            return false;
        }
    }

    public List<Product> findByCategoryId(int id) throws SQLException {
        List<Product> products = new ArrayList<>();
        DBContext context = new DBContext();
        Connection connection = context.openConnection();
        String sql = "SELECT * FROM products WHERE category_id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Product product = new Product();
                product.setName(resultSet.getString("name"));
                product.setPrice(resultSet.getInt("price"));
                product.setImage(resultSet.getString("image"));
                product.setCategoryId(resultSet.getInt("category_id"));
                product.setStatus(resultSet.getInt("status"));
                products.add(product);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        connection.close();
        return products;
    }
}
