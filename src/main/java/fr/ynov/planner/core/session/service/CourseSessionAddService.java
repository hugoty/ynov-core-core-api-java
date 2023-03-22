package fr.ynov.planner.core.session.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import fr.ynov.planner.core.course.model.Course;
import fr.ynov.planner.core.course.service.CourseGetService;
import fr.ynov.planner.core.session.model.CourseSession;
import fr.ynov.planner.core.session.repository.CourseSessionRepository;

@Service
public class CourseSessionAddService {

	private final CourseSessionRepository courseSessionRepository;
	private final CourseGetService courseGetService;

	public CourseSessionAddService(CourseSessionRepository courseSessionRepository, CourseGetService courseGetService) {
		this.courseSessionRepository = courseSessionRepository;
		this.courseGetService = courseGetService;
	}

	public void execute(Long courseId, LocalDate sessionDate) {
		Course course = courseGetService.execute(courseId);

		CourseSession courseSession = new CourseSession();
		courseSession.setCourse(course);
		courseSession.setSessionDate(sessionDate);

		courseSessionRepository.save(courseSession);
	}
}
