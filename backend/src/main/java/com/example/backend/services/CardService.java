package com.example.backend.services;

import java.util.List;

import com.example.backend.dtos.CardDto;

public interface CardService {
    List<CardDto> findAll();
}
