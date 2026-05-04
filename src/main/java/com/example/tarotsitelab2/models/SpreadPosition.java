package com.example.tarotsitelab2.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "spread_positions")
@Data
public class SpreadPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "template_id")
    private SpreadTemplate template;

    private Integer posIndex;
    private String label;
    private String contextDescription;
}