package fr.ynov.planner.core.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.ynov.planner.core.course.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
