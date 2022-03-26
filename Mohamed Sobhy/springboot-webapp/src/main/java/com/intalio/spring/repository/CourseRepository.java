package com.intalio.spring.repository;

import com.intalio.spring.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Integer> {
    List<Course> findCourseByNameContaining(String name);
}
