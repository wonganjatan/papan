package com.example.backend.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.models.BoardList;

public interface BoardListRepository extends JpaRepository<BoardList, UUID> {
    
}
