package fr.ynov.planner.core.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.ynov.planner.core.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
