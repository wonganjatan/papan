package com.example.backend.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.models.Card;
import com.example.backend.services.CardService;

import lombok.AllArgsConstructor;

@RestController 
@AllArgsConstructor 
@RequestMapping("/cards")
@CrossOrigin(origins = "http://localhost:5173")
public class CardController {
    
    private final CardService cardService;

    @GetMapping
    public ResponseEntity<List<Card>> findAll() {
        List<Card> cards = cardService.findAll();

        return ResponseEntity.ok(cards);
    }
}
