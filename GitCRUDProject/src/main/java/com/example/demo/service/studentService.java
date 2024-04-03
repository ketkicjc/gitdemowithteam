package com.example.demo.service;

import com.example.demo.model.Student;

public interface studentService {

	public void postStudentData(Student s);

	public Iterable<Student> dsipalyalldata();

}
