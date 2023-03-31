package fr.ynov.planner.core.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.ynov.planner.core.course.model.Course;
import fr.ynov.planner.core.course.service.CourseListService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/v1/courses")
@Tag(name = "courses", description = "Gestion des cours")
public class CourseListRestController {

	private final CourseListService courseListService;

	@Autowired
	public CourseListRestController(CourseListService courseListService) {
		this.courseListService = courseListService;
	}

	@GetMapping(produces = {"application/json"})
	@Operation(summary = "Liste des cours", description = "Liste les cours existants en base de données", operationId = "listCourses")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<Course>> execute() {
		List<Course> courses = courseListService.execute();
		return ResponseEntity.ok(courses);
	}
}
