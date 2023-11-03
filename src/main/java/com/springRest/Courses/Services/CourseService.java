package com.springRest.Courses.Services;

import java.util.List;

import com.springRest.Courses.entities.Course;

public interface CourseService {
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
//	public Course updateCourse(long courseId, Course course);
	public void deleteCourse(long courseId);
	public Course updateCourse(Course course);
}
