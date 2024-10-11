package com.sushant.JPADEMO_Project.controller;


import com.sushant.JPADEMO_Project.entity.Student;
import com.sushant.JPADEMO_Project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/std")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/save")
    public Student createStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }

    @GetMapping("/all")
        public List<Student> getAllStudents(){
            List<Student> allStudentData = service.getAllStudentData();
            return allStudentData;
        }


    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id)
    {
        return service.getStudentById(id);
    }

//    @GetMapping()
//    public Student getStudentById(@RequestParam Integer id, @RequestParam String name)
//    {
//        return service.getStudentById(id);
//    }
}
