package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
    private static String FIND_BY_ID_SQL = 
        """
            SELECT * FROM COURSE 
            WHERE ID = ?
        """;

    public void insert(Course course) {
        jdbcTemplate.update(INSERT_SQL, course.getName(), course.getAuthor());
    }

    public void deleteById(Long id) {
        jdbcTemplate.update(DELETE_SQL, id);
    }

    public Course findById(Long id) {
        return jdbcTemplate.queryForObject(FIND_BY_ID_SQL, 
                new BeanPropertyRowMapper<>(Course.class), id);
    }
}