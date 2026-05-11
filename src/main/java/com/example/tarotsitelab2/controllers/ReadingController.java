package com.example.tarotsitelab2.controllers;

import com.example.tarotsitelab2.models.Reading;
import com.example.tarotsitelab2.repositories.ReadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/readings")
public class ReadingController {

    @Autowired
    private ReadingRepository readingRepository;

    @GetMapping
    public List<Reading> getAllReadings() {
        return readingRepository.findAll();
    }

    @PostMapping
    public Reading saveReading(@RequestBody Reading reading) {
        return readingRepository.save(reading);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReading(@PathVariable Long id) {
        if (readingRepository.existsById(id)) {
            readingRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}