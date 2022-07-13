package com.greatlearning.student.registrations.controller;

import com.greatlearning.student.registrations.entity.Student;
import com.greatlearning.student.registrations.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/list")
    public String getAllStudents(Model model) {
        List<Student> students = studentService.findAll();
        model.addAttribute("students", students);
        return "student-listing";
    }

    @RequestMapping("/showFormForAdd")
    public String addStudent(Model theModel) {
        Student student = new Student();
        theModel.addAttribute("student", student);
        return "student-save";
    }

    @RequestMapping("/showFormForUpdate")
    public String updateStudent(@RequestParam("id") int id, Model theModel) {
        Student student = studentService.getById(id);
        theModel.addAttribute("student", student);
        return "student-save";
    }

    @RequestMapping("/delete")
    public String deleteStudent(@RequestParam("id") int id) {
        studentService.deleteById(id);
        return "redirect:/students/list";
    }

    @PostMapping("/save")
    public String saveStudent( @RequestParam("studentId") int studentId, @RequestParam("firstName") String firstName,
                               @RequestParam("lastName") String lastName, @RequestParam("course") String course, @RequestParam("country") String country) {
        Student student;
        if (studentId != 0) {
            student = studentService.getById(studentId);
            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setCountry(country);
            student.setCourse(course);
        }
        else {
            student = new Student(firstName, lastName, course, country);
        }
        studentService.save(student);
        return "redirect:/students/list";
    }

    @RequestMapping("/403")
    public ModelAndView handleAccessDenied(Principal user){
        ModelAndView model = new ModelAndView();
        if(user!=null){
            model.addObject("msg","Hi " +user.getName()+", you don't have access to perform this operation.");
        }else{
            model.addObject("msg","Hi, you don't have access to perform this operation.");
        }
        model.setViewName("403");
        return model;
    }


}

