package com.example.tarotsitelab2.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "spread_templates")
@Data
public class SpreadTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @OneToMany(mappedBy = "template")
    private List<SpreadPosition> positions;
}