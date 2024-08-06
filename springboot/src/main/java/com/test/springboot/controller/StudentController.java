package com.test.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.springboot.entity.Student;

@RestController
@RequestMapping("students")
public class StudentController {
    // http://localhost:8080/student/student
    @GetMapping("student")
    public ResponseEntity<Student> getStudent() {
        Student student = new Student();
        student.setId(1);
        student.setFirstName("Dennis");
        student.setLastName("Lee");
        return ResponseEntity.ok()
        .header("custom-header", "Dennis").
        body(student);
    }
    // http://localhost:8080/students
    @GetMapping
    public ResponseEntity<List<Student>> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Dennis1", "Lee"));
        students.add(new Student(1, "Dennis2", "Lee"));
        return ResponseEntity.ok(students);
    }
    // {id} -> @PathVariable
    // http://localhost:8080/students/1/Dennis/Lee
    @GetMapping("{id}/{first-name}/{last-name}")
    public ResponseEntity<Student> studentPathVariable(
        @PathVariable("id") int studentId,
        @PathVariable("first-name") String firstName,
        @PathVariable("last-name") String lastName){
        Student student = 
        new Student(studentId, firstName, lastName);
        return ResponseEntity.ok(student);
    }
}
