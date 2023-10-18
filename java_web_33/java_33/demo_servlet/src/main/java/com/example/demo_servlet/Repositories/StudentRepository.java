package com.example.demo_servlet.Repositories;

import com.example.demo_servlet.Entities.Student;
import com.example.demo_servlet.Utils.DBContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    /**
     * @return
     */
    public List<Student> getAll() {
        List<Student> students = new ArrayList<>();
        DBContext context = new DBContext();
        Connection connection = context.openConnection();
        String sql = "SELECT * FROM students";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setAddress(resultSet.getString("address"));
                student.setAge(resultSet.getInt("age"));
                students.add(student);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return students;
    }

    /**
     * @param id
     * @return
     */
    public Student findById(int id) {
        DBContext context = new DBContext();
        Connection connection = context.openConnection();
        String sql = "SELECT * FROM students WHERE id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Student student = new Student();
            while (resultSet.next()) {
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setAddress(resultSet.getString("address"));
                student.setAge(resultSet.getInt("age"));
            }
            return student;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return new Student();
        }
    }

    /**
     * @param student
     * @return
     */
    public boolean update(Student student) {
        DBContext context = new DBContext();
        Connection connection = context.openConnection();
        String sql = "UPDATE students SET name = ?, address = ?, age = ? WHERE id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getAddress());
            preparedStatement.setInt(3, student.getAge());
            preparedStatement.setInt(4, (int) student.getId());
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    public boolean delete(int id) {
        DBContext context = new DBContext();
        Connection connection = context.openConnection();
        String sql = "DELETE FROM students WHERE id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    public List<Student> findByName(String name) {
        List<Student> students = new ArrayList<>();
        DBContext context = new DBContext();
        Connection connection = context.openConnection();
        String sql = "SELECT * FROM students WHERE name LIKE ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, "%" + name + "%");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setAddress(resultSet.getString("address"));
                student.setAge(resultSet.getInt("age"));
                students.add(student);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return students;
    }

    public boolean add(Student student) {
        DBContext context = new DBContext();
        Connection connection = context.openConnection();
        String sql = "INSERT INTO students(name, address, age) VALUES (?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getAddress());
            preparedStatement.setInt(3, student.getAge());
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }
}
