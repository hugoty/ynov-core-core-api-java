package fr.ynov.planner.core.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.ynov.planner.core.course.service.CourseDeleteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/v1/courses")
@Tag(name = "courses", description = "Gestion des cours")
public class CourseDeleteRestController {

	private final CourseDeleteService courseDeleteService;

	@Autowired
	public CourseDeleteRestController(CourseDeleteService courseDeleteService) {
		this.courseDeleteService = courseDeleteService;
	}

	@DeleteMapping("/{id}")
	@Operation(summary = "Supprimer un cours", description = "Supprime un cours de la base de données avec son identifiant", operationId = "deleteCourse")
	@ResponseStatus(HttpStatus.OK)
	public void execute(@PathVariable(name = "id") Long courseId) {
		courseDeleteService.execute(courseId);
	}
}
