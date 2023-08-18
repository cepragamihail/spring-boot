package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course("Microservices", "in28minutes"));
        repository.insert(new Course("Learn AWS", "in28minutes"));
        repository.insert(new Course("Learn Azure", "in28minutes"));
        repository.insert(new Course("Learn DevOps", "in28minutes"));

        repository.deleteById(2L);

        System.out.println(repository.findById(1L));
        System.out.println(repository.findById(3L));
    }
    
}
