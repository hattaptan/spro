package com.tan.spro.Controller;

import com.tan.spro.Business.Manager.StudentSevice;
import com.tan.spro.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private StudentSevice _studentSevice;

    @Autowired
    public StudentController(StudentSevice studentSevice) {
        this._studentSevice = studentSevice;
    }

    public List<Student> getAll(){
        return _studentSevice.getAllStudent();
    }
}
