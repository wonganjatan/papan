package com.example.backend.services;

import java.util.List;

import com.example.backend.models.Card;

public interface CardService {
    List<Card> findAll();
}
