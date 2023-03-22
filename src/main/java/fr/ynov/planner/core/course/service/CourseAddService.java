package fr.ynov.planner.core.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ynov.planner.core.course.dto.CourseDto;
import fr.ynov.planner.core.course.mapper.CourseDtoMapper;
import fr.ynov.planner.core.course.model.Course;
import fr.ynov.planner.core.course.repository.CourseRepository;

@Service
public class CourseAddService {

	private final CourseRepository courseRepository;
	private final CourseDtoMapper dtoMapper;

	@Autowired
	public CourseAddService(CourseRepository courseRepository, CourseDtoMapper dtoMapper) {
		this.courseRepository = courseRepository;
		this.dtoMapper = dtoMapper;
	}

	public CourseDto execute(CourseDto courseDto) {
		Course course = new Course();
		course.setTitle(courseDto.getTitle());
		course.setDescription(courseDto.getDescription());

		Course createdCourse = courseRepository.save(course);

		CourseDto createdCourseDto = dtoMapper.mapToCourseDto(createdCourse);
		return createdCourseDto;
	}
}
