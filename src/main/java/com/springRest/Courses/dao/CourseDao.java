package com.springRest.Courses.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springRest.Courses.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long>{
	
}
