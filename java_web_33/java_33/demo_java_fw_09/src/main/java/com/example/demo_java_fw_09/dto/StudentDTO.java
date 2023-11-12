package com.example.demo_java_fw_09.dto;

import com.example.demo_java_fw_09.entities.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
    private String name;
    private int age;

    public Student toEntity() {
        return new Student(0, this.name, this.age);
    }
}
