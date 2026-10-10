package com.example.backend.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.backend.models.BoardList;
import com.example.backend.repositories.BoardListRepository;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor 
public class BoardListServiceImpl implements BoardListService {
    private final BoardListRepository boardListRepository;

    public List<BoardList> findAll() {
        return 
    }
}
