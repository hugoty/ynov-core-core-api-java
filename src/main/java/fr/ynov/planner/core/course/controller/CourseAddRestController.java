package fr.ynov.planner.core.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.ynov.planner.core.course.dto.CourseDto;
import fr.ynov.planner.core.course.service.CourseAddService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/v1/courses")
@Tag(name = "courses", description = "Gestion des cours")
public class CourseAddRestController {

	private final CourseAddService courseAddService;

	@Autowired
	public CourseAddRestController(CourseAddService courseAddService) {

		this.courseAddService = courseAddService;
	}

	@PostMapping(consumes = {"application/json"}, produces = {"application/json"})
	@Operation(summary = "Ajoute un cours", description = "Ajoute un nouveau cours en base de données avec un identifiant généré", operationId = "addCourse")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<CourseDto> execute(@RequestBody CourseDto courseDto) {
		CourseDto createdCourse = courseAddService.execute(courseDto);
		return ResponseEntity.ok(createdCourse);
	}
}
