package com.example.tarotsitelab2.repositories;

import com.example.tarotsitelab2.models.SpreadTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpreadTemplateRepository extends JpaRepository<SpreadTemplate, Long> {
}