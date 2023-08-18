package com.in28minutes.springboot.learnjpaandhibernate.course;

public class Course {

    private Long id;
    private String name;
    private String author;

    public Course() {
    }

    public Course(Long id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Course(String name, String author) {
        super();
        this.name = name;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public void setAuthor(String author) { 
        this.author = author;
        
    }
    
    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
    }
}
