package fr.ynov.planner.core.session.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import fr.ynov.planner.core.course.model.Course;
import fr.ynov.planner.core.student.model.Student;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "course_session")
public class CourseSession {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "session_date")
	private LocalDate sessionDate;

	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST})
	@JoinColumn(name = "course_id")
	private Course course;

	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name = "course_session_student_assignment")
	private Set<Student> assignedStudents;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Set<Student> getAssignedStudents() {
		if (assignedStudents == null) {
			assignedStudents = new HashSet<>();
		}

		return assignedStudents;
	}

	public void setAssignedStudents(Set<Student> assignedStudents) {
		this.assignedStudents = assignedStudents;
	}

	public LocalDate getSessionDate() {
		return sessionDate;
	}

	public void setSessionDate(LocalDate sessionDate) {
		this.sessionDate = sessionDate;
	}
}
