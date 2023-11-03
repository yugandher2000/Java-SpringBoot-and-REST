package com.springRest.Courses.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springRest.Courses.dao.CourseDao;
import com.springRest.Courses.entities.Course;

import org.apache.el.stream.Optional;
import org.springframework.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CourseServiceimpl implements CourseService {
	@Autowired
	private CourseDao courseDao;
	
	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}

//	@Override
//	public Course getCourse(long courseId) {
//		return courseDao.getOne(courseId);
//	}
	
	@Override
	public Course getCourse(long courseId) {
	    java.util.Optional<Course> optionalCourse = courseDao.findById(courseId);
	    return optionalCourse.orElse(null);
	}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	 @Override
	    public Course updateCourse(Course course) {
		 	courseDao.save(course);
	        return course;
	    }

	 @Override
	    public void deleteCourse(long parseLong) {
		 	Course entity = courseDao.getOne(parseLong);
		 	courseDao.delete(entity);
	    }


}
