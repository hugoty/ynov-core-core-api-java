package fr.ynov.planner.core.session.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ynov.planner.core.session.model.CourseSession;
import fr.ynov.planner.core.session.repository.CourseSessionRepository;

@Service
public class CourseSessionGetService {

	private final CourseSessionRepository courseSessionRepository;

	@Autowired
	public CourseSessionGetService(CourseSessionRepository courseSessionRepository) {
		this.courseSessionRepository = courseSessionRepository;
	}

	public CourseSession execute(Long id) {
		CourseSession courseSession = courseSessionRepository.getReferenceById(id);
		return courseSession;
	}
}
