package com.example.coursemanager.controller;

import com.example.coursemanager.model.LessonBlock;
import com.example.coursemanager.repository.LessonBlockRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class LeessonBlockController {

    private final LessonBlockRepository lessonBlockRepository;

    @GetMapping("/lessonblocks")
    public List<LessonBlock> getLessonBlocks() {
        return lessonBlockRepository.findAll().stream().collect(Collectors.toList());
    }
}
