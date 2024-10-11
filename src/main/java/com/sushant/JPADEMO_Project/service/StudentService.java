package com.sushant.JPADEMO_Project.service;


import com.sushant.JPADEMO_Project.entity.Student;
import com.sushant.JPADEMO_Project.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public Student saveStudent(Student student){
        return studentRepo.save(student);
    }

    public List<Student> getAllStudentData(){
        List<Student> list = studentRepo.findAll();
        return list;
    }
    public Student getStudentById(Integer id){
        Optional<Student> byId = studentRepo.findById(id);
        Student student = byId.get();
        return student;
    }
}
