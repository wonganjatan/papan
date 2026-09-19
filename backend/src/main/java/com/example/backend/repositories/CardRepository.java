package com.example.backend.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.models.Card;

public interface CardRepository extends JpaRepository<Card, UUID> {
    List<Card> findAll();
}
