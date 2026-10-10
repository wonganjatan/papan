package com.example.backend.services;

import java.util.List;

import com.example.backend.models.BoardList;

public interface BoardListService {
    List<BoardList> findAll();
}
