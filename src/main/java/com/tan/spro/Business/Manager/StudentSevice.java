package com.tan.spro.Business.Manager;

import com.tan.spro.Entity.Student;
import com.tan.spro.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentSevice {

    private final StudentRepository _studentRepository;

    @Autowired
    public StudentSevice(StudentRepository studentRepository) {
        _studentRepository = studentRepository;
    }

    public List<Student> getAllStudent(){

        return _studentRepository.findAll();
    }
}
