package com.example.tarotsitelab2.controllers;

import com.example.tarotsitelab2.models.SpreadTemplate;
import com.example.tarotsitelab2.repositories.SpreadTemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/templates")
public class SpreadTemplateController {

    @Autowired
    private SpreadTemplateRepository templateRepository;

    @GetMapping
    public List<SpreadTemplate> getAllTemplates() {
        return templateRepository.findAll();
    }
}