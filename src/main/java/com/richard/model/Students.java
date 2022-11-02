package com.richard.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "students")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String nameStudents;

    @Column
    private Integer ageStudents;

}
