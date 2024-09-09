package com.example.SpringDockerKubernatesExample.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringDockerKubernatesExample.Service.StudentService;
import com.example.SpringDockerKubernatesExample.entity.Student;

@RestController
@RequestMapping(path = "/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping(value = "/save")
	public Student save(@RequestBody Student student) {
		Student save = studentService.save(student);
		return save;
	}

	@GetMapping(value = "/list")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
}
