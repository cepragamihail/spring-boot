package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static String INSERT_SQL = 
        """
            INSERT INTO COURSE (NAME, AUTHOR) 
            VALUES (?, ?);
        """;
    private static String DELETE_SQL = 
        """
            DELETE FROM COURSE 
            WHERE ID = ?
        """;

    public void insert(Course course) {
        jdbcTemplate.update(INSERT_SQL, course.getName(), course.getAuthor());
    }

    public void deleteById(Long id) {
        jdbcTemplate.update(DELETE_SQL, id);
    }
}
