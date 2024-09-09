package com.example.SpringDockerKubernatesExample.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.SpringDockerKubernatesExample.Repository.StudentRepository;
import com.example.SpringDockerKubernatesExample.entity.Student;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public Student save(Student student) {
		Student saveStudent=studentRepository.save(student);
		return saveStudent;
	}
	
	  public List<Student> getAllStudents() {
	        List<Student> allStudents = studentRepository.findAll();
			return allStudents;
	    }
}
