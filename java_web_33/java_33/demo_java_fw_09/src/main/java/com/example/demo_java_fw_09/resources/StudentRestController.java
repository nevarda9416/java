package com.example.demo_java_fw_09.resources;

import com.example.demo_java_fw_09.dto.StudentDTO;
import com.example.demo_java_fw_09.entities.Student;
import com.example.demo_java_fw_09.repositories.StudentRepository;
import com.example.demo_java_fw_09.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    @Autowired
    IStudentService studentService;
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAll() {
        List<Student> students = studentService.getAll();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @PostMapping("/students/add")
    public ResponseEntity<String> add(@RequestBody StudentDTO studentDTO) {
        int result = studentService.save(studentDTO);
        if (result == 1) {
            return new ResponseEntity<>("Thêm mới thành công", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Thêm mới thất bại", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/students/search")
    public ResponseEntity<List<Student>> findByName(@RequestParam("keyword") String text) {
        List<Student> students = new ArrayList<>();
        if (text.isEmpty()) {
            students = studentService.getAll();
        } else {
            students = studentService.search(text);
        }
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @PutMapping("/students/update/{id}")
    public ResponseEntity<String> edit(@PathVariable("id") Long id, @RequestBody StudentDTO studentDTO) {
        studentRepository.save(new Student(id, studentDTO.getName(), studentDTO.getAge()));
        return new ResponseEntity<>("Sửa thành công", HttpStatus.OK);
    }

    @DeleteMapping("/students/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        studentService.deleteById(id);
        return new ResponseEntity<>("Xóa thành công", HttpStatus.OK);
    }
}
