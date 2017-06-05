package com.randall.Service;

import com.randall.DAO.StudentDAO;
import com.randall.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by AnruiSOUL on 6/5/2017.
 */

@Service
public class StudentService {

    @Autowired
    private StudentDAO studentDAO;

    public Collection<Student> getAllStudents(){
        return studentDAO.getAllStudents();
    }

    public Student getStudentById(int id){
        return this.studentDAO.getStudentById(id);
    }

    public void removeStudentById(int id) {
        this.studentDAO.removeStudentById(id);
    }

    public void updateStudent(Student student) {
        this.studentDAO.updateStudent(student);
    }

    public void insertStudent(Student student) {
        studentDAO.insertStudentToDb(student);
    }
}
