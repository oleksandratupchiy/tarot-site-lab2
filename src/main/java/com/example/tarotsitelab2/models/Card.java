package com.example.tarotsitelab2.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "cards")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String suit;   // Масть
    private String arcana; // Старший чи Молодший аркан
    private String element; // Стихія

    @Column(columnDefinition = "TEXT")
    private String meaningUp; // Пряме значення

    @Column(columnDefinition = "TEXT")
    private String meaningRev; // Перевернуте значення
}