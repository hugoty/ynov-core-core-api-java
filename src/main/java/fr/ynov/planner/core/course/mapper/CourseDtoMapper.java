package fr.ynov.planner.core.course.mapper;

import org.springframework.stereotype.Component;

import fr.ynov.planner.core.course.dto.CourseDto;
import fr.ynov.planner.core.course.model.Course;

@Component
public class CourseDtoMapper {

	public CourseDto mapToCourseDto(Course course) {
		CourseDto courseDto = new CourseDto();
		courseDto.setId(course.getId());
		courseDto.setTitle(course.getTitle());
		courseDto.setDescription(course.getDescription());

		return courseDto;
	}
}
