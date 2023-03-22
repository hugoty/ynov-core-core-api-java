package fr.ynov.planner.core.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ynov.planner.core.student.model.Student;
import fr.ynov.planner.core.student.repository.StudentRepository;

@Service
public class StudentGetService {

	private final StudentRepository studentRepository;

	@Autowired
	public StudentGetService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public Student execute(Long id) {
		Student student = studentRepository.getReferenceById(id);
		return student;
	}

}
