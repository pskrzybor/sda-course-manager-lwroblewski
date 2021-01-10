package com.example.coursemanager.course.controller;

import com.example.coursemanager.course.CourseRepository;
import com.example.coursemanager.course.model.Course;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class CourseController {

    private final CourseRepository courseRepository;

    @GetMapping("/course")
    public List<Course> getCoursesList() {
        return courseRepository.findAll().stream().collect(Collectors.toList());
    }

}