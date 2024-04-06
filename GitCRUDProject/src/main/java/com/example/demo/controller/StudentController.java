package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.studentService;

@RestController
public class StudentController {
	@Autowired
	studentService studentService;
	@RequestMapping("/postStudentData")
	public String postData(@RequestBody Student s)
	{
		studentService.postStudentData(s);
		return "Data Submitted";
	}
 
	//Test push
	
	@RequestMapping("/getalldata")
	public Iterable<Student> getalldata(){
		Iterable<Student>list=studentService.dsipalyalldata();
		return list;
		
	}
	
	@RequestMapping("/getdata")
	public Iterable<Student> getdata(){
		Iterable<Student>list=studentService.displaydata();
		return list;
		
	}
	
	
}
