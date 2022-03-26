package com.intalio.spring.controller;

import com.intalio.spring.model.Course;
import com.intalio.spring.model.Student;
import com.intalio.spring.repository.CourseRepository;
import com.intalio.spring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    CourseRepository courseRepository;

    @GetMapping("/students")
    public String getAllStudents(@RequestParam(required = false) String name, Model model) {
        List<Student> studentList = new ArrayList<>();
        if(name==null){
            studentList.addAll(studentRepository.findAll());
        }else{
            studentList.addAll(studentRepository.findStudentByNameContaining(name));
        }
        model.addAttribute("studentList", studentList);
        return("students");
    }


    @GetMapping("/courses")
    public String getAllCourses(@RequestParam(required = false) String name, Model model) {
        List<Course> courseList = new ArrayList<>();
        if(name==null){
            courseList.addAll(courseRepository.findAll());
        }else{
            courseList.addAll(courseRepository.findCourseByNameContaining(name));
        }
        model.addAttribute("courseList", courseList);
        return("courses");
    }

    }
