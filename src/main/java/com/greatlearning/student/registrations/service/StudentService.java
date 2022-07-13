package com.greatlearning.student.registrations.service;

import com.greatlearning.student.registrations.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> findAll();
    public Student save(Student student);
    public Student getById(Integer id);
    public Student deleteById(Integer id);
}
