package com.tan.spro.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@Table(name="Student")
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @SequenceGenerator(name = "student_sequence",sequenceName ="student_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "student_sequence")
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private String session;
    private int lessonQuantity;


}
