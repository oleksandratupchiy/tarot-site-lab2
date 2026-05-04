package com.example.tarotsitelab2.repositories;

import com.example.tarotsitelab2.models.SpreadPosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpreadPositionRepository extends JpaRepository<SpreadPosition, Long> {
}