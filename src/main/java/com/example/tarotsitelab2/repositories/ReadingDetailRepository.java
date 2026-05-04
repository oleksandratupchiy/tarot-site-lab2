package com.example.tarotsitelab2.repositories;

import com.example.tarotsitelab2.models.ReadingDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadingDetailRepository extends JpaRepository<ReadingDetail, Long> {
}