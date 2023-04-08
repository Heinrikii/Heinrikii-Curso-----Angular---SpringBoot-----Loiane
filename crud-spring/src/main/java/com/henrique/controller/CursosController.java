package com.henrique.controller;

import com.henrique.model.Course;
import com.henrique.repository.CourseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CursosController {

    private final CourseRepository courseRepository;

    public CursosController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping
    public @ResponseBody List<Course > list(){
        return courseRepository.findAll();
    };

    @PostMapping
    public void post(@RequestBody Course course){
        courseRepository.save(course);
    }






}
