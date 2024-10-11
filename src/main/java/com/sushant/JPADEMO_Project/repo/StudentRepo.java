package com.sushant.JPADEMO_Project.repo;

import com.sushant.JPADEMO_Project.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
}
