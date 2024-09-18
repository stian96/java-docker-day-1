package com.booleanuk.api.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "date_of_birth")
    private LocalDateTime dateOfBirth;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "average_grade")
    private String averageGrade;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Course> courses;

    public Student(
            String firstName,
            String lastName,
            LocalDateTime birth,
            LocalDateTime startDate,
            String averageGrade)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = birth;
        this.startDate = startDate;
        this.averageGrade = averageGrade;
    }
}
