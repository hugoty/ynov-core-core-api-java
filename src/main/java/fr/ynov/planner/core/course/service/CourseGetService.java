package fr.ynov.planner.core.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ynov.planner.core.course.model.Course;
import fr.ynov.planner.core.course.repository.CourseRepository;

@Service
public class CourseGetService {

	private final CourseRepository courseRepository;

	@Autowired
	public CourseGetService(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	public Course execute(Long id) {
		Course course = courseRepository.getReferenceById(id);
		return course;
	}
}
