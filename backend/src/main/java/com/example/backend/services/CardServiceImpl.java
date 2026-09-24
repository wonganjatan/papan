package com.example.backend.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.backend.dtos.CardDto;
import com.example.backend.models.Card;
import com.example.backend.repositories.CardRepository;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor 
public class CardServiceImpl implements CardService {
    private final CardRepository cardRepository;

    public List<CardDto> findAll() {
        return cardRepository.findAll().stream()
                .map(this::toDto)
                .toList();
    }

    private CardDto toDto(Card card) {
        return new CardDto(
            card.getId(),
            card.getList().getId(),
            card.getTitle(),
            card.getDescription(),
            card.getCreatedAt()
        );
    }
}
