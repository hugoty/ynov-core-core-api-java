package fr.ynov.planner.core.session.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.ynov.planner.core.session.model.CourseSession;

public interface CourseSessionRepository extends JpaRepository<CourseSession, Long> {

}
