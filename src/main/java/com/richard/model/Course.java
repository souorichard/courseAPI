package com.richard.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="namecourse")
    private String nameCourse;

    @Column
    private String period;

    @JsonIgnore
    @OneToMany(mappedBy = "course")
    private List<Students> students = new ArrayList<>();

}
