package com.example.tarotsitelab2.controllers;

import com.example.tarotsitelab2.models.Card;
import com.example.tarotsitelab2.repositories.CardRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CardControllerTest {

    @Mock
    private CardRepository cardRepository;

    @InjectMocks
    private CardController cardController;

    // перевіряє, чи контролер коректно отримує список карт з бази даних та віддає його без змін
    @Test
    public void testGetAllCards() {
        Card card = new Card();
        card.setId(1L);
        card.setName("The Magician");

        when(cardRepository.findAll()).thenReturn(Arrays.asList(card));

        List<Card> result = cardController.getAllCards();

        assertEquals(1, result.size());
        assertEquals("The Magician", result.get(0).getName());
    }
}