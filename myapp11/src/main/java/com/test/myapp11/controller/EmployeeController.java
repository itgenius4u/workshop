package com.test.myapp11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/employees")
public class EmployeeController {

    @GetMapping
    public String getAllEmployees() {
        return "getAllEmployees()";
    }
    @PostMapping
    public String saveEmployees() {
        return "saveEmployees()";
    }
    @PutMapping
    public String updateEmployees() {
        return "updateEmployees()";
    }    

}
