package com.example.SpringTestRequest;

import com.google.common.net.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/management")
public class StudentManagementServiceAPI {

    private List<Student> STUDENTS= Arrays.asList
            (new Student(1,"Student1"),new Student(2,"student2"),new Student(3,"Student3"));


    @GetMapping
    public List<Student> getSTUDENTS(){return STUDENTS;}

    @PostMapping
    public Integer putStudent(@RequestBody Student student){
        System.out.println(student);
        STUDENTS.add(student);

        return 1;

    }

    @PutMapping
    public void updateStundet(Integer studentId,@RequestBody Student student){
        System.out.println(student);

    }

    @DeleteMapping(path = "studentId")
    public int deleteStudent(@PathVariable ("studentId") Integer studentId){
        System.out.println(studentId.intValue());
        return studentId;
    }




}
