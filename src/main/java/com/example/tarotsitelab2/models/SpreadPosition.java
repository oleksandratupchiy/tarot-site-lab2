package com.example.tarotsitelab2.models;

import jakarta.persistence.*;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "spread_positions")
@Data
public class SpreadPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer posIndex;
    private String label;
    private String contextDescription;

    @ManyToOne
    @JoinColumn(name = "template_id")
    @JsonIgnore
    private SpreadTemplate template;
}