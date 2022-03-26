package com.intalio.spring.repository;

import com.intalio.spring.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    List<Student> findStudentByNameContaining(String name);
}
