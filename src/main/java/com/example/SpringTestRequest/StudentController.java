package com.example.SpringTestRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    private List<Student> studentList=
            Arrays.asList(new Student(1,"samm"),new Student(2,"Allah"),new Student(3,"jesus"));

    @RequestMapping(path = "{studentId}")
    public  Student getStudent(@PathVariable("studentId") Integer id){

     return    studentList.stream().filter(student -> student.getId()==id.intValue()).findFirst()
                .orElseThrow(()->new IllegalStateException("Student "+id.intValue() +" does not exists!"));
    }






}
