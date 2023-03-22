package fr.ynov.planner.core.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ynov.planner.core.course.model.Course;
import fr.ynov.planner.core.course.repository.CourseRepository;

@Service
public class CourseListService {

	private final CourseRepository courseRepository;
	
	@Autowired
	public CourseListService(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}
	
	public List<Course> execute() {
		List<Course> courses = courseRepository.findAll();
		return courses;
	}
}
