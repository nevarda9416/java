package com.example.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringJdbcTemplate2PostgreSqlApplication implements CommandLineRunner {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcTemplate2PostgreSqlApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        String sql = "INSERT INTO students (name, email) VALUES (" + "'Nam Ha Minh', 'name@codejava.net')";
        int rows = jdbcTemplate.update(sql);
        if (rows > 0) {
            System.out.println("A new row has been inserted.");
        }
    }
}
