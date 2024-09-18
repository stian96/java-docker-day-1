package com.booleanuk.api.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

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

    @Column(name = "course_title")
    private String courseTitle;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "average_grade")
    private String averageGrade;

    public Student(
            String firstName,
            String lastName,
            LocalDateTime birth,
            String courseTitle,
            LocalDateTime startDate,
            String averageGrade)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = birth;
        this.courseTitle = courseTitle;
        this.startDate = startDate;
        this.averageGrade = averageGrade;
    }
}
