package com.example.backend.dtos;

import java.time.Instant;
import java.util.UUID;

public record CardDto(
    UUID id,
    UUID list,
    String title,
    String description,
    Instant createdAt
) {}
