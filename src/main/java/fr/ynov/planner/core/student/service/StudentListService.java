package fr.ynov.planner.core.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ynov.planner.core.student.model.Student;
import fr.ynov.planner.core.student.repository.StudentRepository;

@Service
public class StudentListService {

	private final StudentRepository studentRepository;
	
	@Autowired
	public StudentListService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	public List<Student> execute() {
		List<Student> courses = studentRepository.findAll();
		return courses;
	}
}
