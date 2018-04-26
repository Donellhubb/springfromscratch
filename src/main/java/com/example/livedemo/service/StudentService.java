package com.example.livedemo.service;

import com.example.livedemo.model.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentService {
    private List<Student> studentsList = new ArrayList<>();

    public StudentService(){
        Student student1 = new Student();
        student1.setName("Donell");
        student1.setAge(25);
        Student student2 = new Student("Bryant",27);
        Student student3 = new Student("Josh",24);
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }
}

