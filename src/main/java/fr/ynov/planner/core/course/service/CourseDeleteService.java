package fr.ynov.planner.core.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ynov.planner.core.course.repository.CourseRepository;

@Service
public class CourseDeleteService {

	private final CourseRepository courseRepository;

	@Autowired
	public CourseDeleteService(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	public void execute(Long courseId) {
		courseRepository.deleteById(courseId);
	}
}
