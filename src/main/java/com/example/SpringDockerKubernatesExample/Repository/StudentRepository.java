package com.example.SpringDockerKubernatesExample.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringDockerKubernatesExample.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	public Student save(Student stduent);
	public List<Student> findAll();

}
