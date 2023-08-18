package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static String INSERT_SQL = 
        """
            INSERT INTO COURSE (NAME, AUTHOR) 
            VALUES ('Learn AWS', 'in28minutes');
        """;
    public void insert() {
        jdbcTemplate.update(INSERT_SQL);
    }
}
