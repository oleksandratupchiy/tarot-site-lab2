package com.example.tarotsitelab2.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "reading_details")
@Data
public class ReadingDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "reading_id")
    private Reading reading;

    @ManyToOne
    @JoinColumn(name = "card_id")
    private Card card;

    private Integer posIndex;
    private Boolean isReversed;
}