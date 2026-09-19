package com.example.backend.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.backend.models.Card;
import com.example.backend.repositories.CardRepository;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor 
public class CardServiceImpl implements CardService {
    private final CardRepository cardRepository;

    public List<Card> findAll() {
        return cardRepository.findAll();
    }
}
