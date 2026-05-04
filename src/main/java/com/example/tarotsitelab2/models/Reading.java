package com.example.tarotsitelab2.models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "readings")
@Data
public class Reading {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "template_id")
    private SpreadTemplate template;

    private LocalDateTime createdAt = LocalDateTime.now();

    @OneToMany(mappedBy = "reading", cascade = CascadeType.ALL)
    private List<ReadingDetail> details;
}