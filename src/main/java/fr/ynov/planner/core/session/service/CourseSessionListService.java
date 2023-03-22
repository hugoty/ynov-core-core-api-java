package fr.ynov.planner.core.session.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.ynov.planner.core.session.model.CourseSession;
import fr.ynov.planner.core.session.repository.CourseSessionRepository;

@Service
public class CourseSessionListService {

	private final CourseSessionRepository courseSessionRepository;

	public CourseSessionListService(CourseSessionRepository courseSessionRepository) {
		this.courseSessionRepository = courseSessionRepository;
	}

	public List<CourseSession> execute() {
		return courseSessionRepository.findAll();
	}
}
