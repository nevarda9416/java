package com.example.spring_boot;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
    @GetMapping(value = "/")
    public String index() {
        return "index";
    }

    @GetMapping(value = "/callapiclient")
    public String callAPIClient() throws JsonProcessingException {
        String json = "{\"name\":\"David\",\"position\":\"SOFTWARE_ENGINEER\",\"skilltree\":[\"Java\",\"Python\",\"JavaScript\"],\"address\":{\"street\":\"Street\",\"streetNo\":\"123\"}}";
        // ObjectMapper instantiation
        ObjectMapper objectMapper = new ObjectMapper();
        // Deserialization into the `Employee` class
        Employee employee = objectMapper.readValue(json, Employee.class);
        // Print information
        System.out.println("Name: " + employee.getName());
        System.out.println("Position: " + employee.getPosition());
        System.out.println("Skilltree: " + employee.getSkilltree());
        System.out.println("Address: " + employee.getAddress().getStreet() + ' ' + employee.getAddress().getStreetNo());
        return employee.toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
