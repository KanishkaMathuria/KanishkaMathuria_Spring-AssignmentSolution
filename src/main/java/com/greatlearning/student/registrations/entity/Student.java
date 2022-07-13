package com.greatlearning.student.registrations.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name="Student")
@Entity
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Student_Id")
    private int studentId;
    @Column(name = "First_Name")
    private String firstName;
    @Column(name = "Last_Name")
    private String lastName;
    @Column(name = "Course")
    private String course;
    @Column(name = "Country")
    private String country;

    public Student() {
        // TODO Auto-generated constructor stub
    }
    public Student(String firstName, String lastName, String course, String country) {
        this.firstName= firstName;
        this.lastName = lastName;
        this.course= course;
        this.country= country;
    }
}