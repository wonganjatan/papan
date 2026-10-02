package com.example.backend.dtos;

import java.util.List;
import java.util.UUID;

import com.example.backend.models.Card;

public record BoardListDto (
    UUID id,
    String title,
    List<Card> cards
) {}
