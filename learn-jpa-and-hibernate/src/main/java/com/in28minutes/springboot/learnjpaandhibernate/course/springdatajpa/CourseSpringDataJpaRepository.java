package com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{

    List<Course> findByName(String string);

    List<Course> findByAuthor(String string);

    List<Course> findByNameAndAuthor(String string, String string2);
    
}
