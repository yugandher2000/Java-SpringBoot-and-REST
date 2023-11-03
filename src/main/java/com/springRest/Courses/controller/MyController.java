package com.springRest.Courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.springRest.Courses.Services.CourseService;
import com.springRest.Courses.entities.Course;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
@RestController
@RequestMapping("/courses")
public class MyController {
    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> getCourses() {
        return courseService.getCourses();
    }

    @GetMapping("/{courseId}")
    public Course getCourse(@PathVariable long courseId) {
        return courseService.getCourse(courseId);
    }

    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }
    
    @PutMapping("/{courseId}")
    public Course updateCourse(@PathVariable long courseId, @RequestBody Course updatedCourse) throws Exception {
        Course result = courseService.updateCourse(updatedCourse);
        if (result != null) {
            return result;
        } else {
            throw new Exception("Course not found with ID: " + courseId);
        }
    }
    
//    @DeleteMapping("/courses/{courseId}")
//    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
//    	try {
//    		this.courseService.deleteCourse(Long.parseLong(courseId));
//    		return new ResponseEntity<>(HttpStatus.OK);
//    	} catch (Exception e) {
//    		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//    	}
//    }
    @DeleteMapping("/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable long courseId) {
        courseService.deleteCourse(courseId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
