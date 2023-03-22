package fr.ynov.planner.core.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ynov.planner.core.student.model.Student;
import fr.ynov.planner.core.student.service.StudentListService;

@RestController
@RequestMapping("/api/v1/student")
public class StudentListRestController {

	private final StudentListService studentListService;
	
	@Autowired
	public StudentListRestController(StudentListService studentListService) {
		this.studentListService = studentListService;
	}
	
	@GetMapping()
	public ResponseEntity<List<Student>> execute() {
		List<Student> students = studentListService.execute();
		return ResponseEntity.ok(students);
	}
}
