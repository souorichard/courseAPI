package com.richard.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String nameCourse;

    @Column
    private String period;

}
