package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.studentRepository;
import com.example.demo.service.studentService;
@Service
public class studentServiceImpl implements studentService{
	@Autowired
	studentRepository studentRepository;
	@Override
	public void postStudentData(Student s) {
		studentRepository.save(s);	
	}
	@Override
	public Iterable<Student> dsipalyalldata() {
	
		return studentRepository.findAll() ;
	}
	@Override
	public Iterable<Student> displaydata() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

}
