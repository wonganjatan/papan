package com.example.backend.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.dtos.CardDto;
import com.example.backend.services.CardService;

import lombok.AllArgsConstructor;

@RestController 
@AllArgsConstructor 
@RequestMapping("/api/cards")
@CrossOrigin(origins = "http://localhost:5173")
public class CardController {
    
    private final CardService cardService;

    @GetMapping
    public ResponseEntity<List<CardDto>> findAll() {
        List<CardDto> cards = cardService.findAll();

        return ResponseEntity.ok(cards);
    }
}
