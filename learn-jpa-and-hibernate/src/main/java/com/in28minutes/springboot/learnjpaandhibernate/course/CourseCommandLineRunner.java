package com.in28minutes.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

    // @Autowired
    // private CourseJdbcRepository repository;
    // @Autowired
    // private CourseJpaRepository repository;
    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course("Microservices!!!", "in28minutes"));
        repository.save(new Course("Learn AWS", "in28minutes"));
        repository.save(new Course("Learn Azure", "in28minutes"));
        repository.save(new Course("Learn DevOps", "in28minutes"));

        repository.deleteById(2L);

        System.out.println(repository.findById(1L));
        System.out.println(repository.findById(3L));
        System.out.println(repository.findByName("Learn Azure"));
        System.out.println(repository.count());
        System.out.println(repository.findAll());
        System.out.println(repository.findByAuthor("in28minutes"));
        System.out.println(repository.findByNameAndAuthor("Learn DevOps", "in28minutes"));
    }


    // @Override
    // public void run(String... args) throws Exception {
    //     repository.insert(new Course("Microservices!!!", "in28minutes"));
    //     repository.insert(new Course("Learn AWS", "in28minutes"));
    //     repository.insert(new Course("Learn Azure", "in28minutes"));
    //     repository.insert(new Course("Learn DevOps", "in28minutes"));

    //     repository.deleteById(2L);

    //     System.out.println(repository.findById(1L));
    //     System.out.println(repository.findById(3L));
    // }
    
}
