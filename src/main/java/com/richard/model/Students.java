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

    @Column(name="namestudents")
    private String nameStudents;

    @Column(name="agestudents")
    private Integer ageStudents;

    @ManyToOne
    @JoinColumn(name = "idcourse")
    private Course course;

}
