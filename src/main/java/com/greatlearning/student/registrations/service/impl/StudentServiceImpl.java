package com.greatlearning.student.registrations.service.impl;

import com.greatlearning.student.registrations.entity.Student;
import com.greatlearning.student.registrations.repository.StudentRepository;
import com.greatlearning.student.registrations.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student save(Student student) {
        Student responseObj = studentRepository.save(student);
        return responseObj;
    }

    @Override
    public Student getById(Integer id) {
        Student responseObj = studentRepository.findById(id).get();
        return responseObj;
    }

    @Override
    public Student deleteById(Integer id) {
        Student responseObj = studentRepository.findById(id).get();
        studentRepository.deleteById(id);
        return responseObj;
    }
}
