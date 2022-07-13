package com.greatlearning.student.registrations.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Role")
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Role_Id")
    private int roleId;

    @Column(name = "Name")
    private String name;
}
