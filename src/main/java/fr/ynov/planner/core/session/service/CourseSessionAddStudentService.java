package fr.ynov.planner.core.session.service;

import org.springframework.stereotype.Service;

import fr.ynov.planner.core.session.model.CourseSession;
import fr.ynov.planner.core.session.repository.CourseSessionRepository;
import fr.ynov.planner.core.student.model.Student;
import fr.ynov.planner.core.student.service.StudentGetService;

@Service
public class CourseSessionAddStudentService {

	private final CourseSessionGetService courseSessionGetService;
	private final StudentGetService studentGetService;
	private final CourseSessionRepository courseSessionRepository;

	public CourseSessionAddStudentService(CourseSessionGetService courseSessionGetService,
			StudentGetService studentGetService, CourseSessionRepository courseSessionRepository) {
		this.courseSessionGetService = courseSessionGetService;
		this.studentGetService = studentGetService;
		this.courseSessionRepository = courseSessionRepository;
	}

	public void execute(Long courseSessionId, Long studentId) {
		CourseSession courseSession = courseSessionGetService.execute(courseSessionId);
		Student student = studentGetService.execute(studentId);

		courseSession.getAssignedStudents().add(student);
		courseSessionRepository.save(courseSession);
	}
}
