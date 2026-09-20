package com.example.backend.config;

import com.example.backend.models.BoardList;
import com.example.backend.models.Card;
import com.example.backend.repositories.BoardListRepository;
import com.example.backend.repositories.CardRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;

@Configuration
public class DataSeeder {

    @Bean
    CommandLineRunner seedData(BoardListRepository listRepository, CardRepository cardRepository) {
        return args -> {
            if (listRepository.count() > 0) return; // don't reseed if data already exists

            BoardList todo = new BoardList();
            todo.setTitle("To Do");
            listRepository.save(todo);

            BoardList inProgress = new BoardList();
            inProgress.setTitle("In Progress");
            listRepository.save(inProgress);

            BoardList done = new BoardList();
            done.setTitle("Done");
            listRepository.save(done);

            Card card1 = new Card();
            card1.setTitle("Set up Spring Boot project");
            card1.setDescription("Initialize backend with Postgres and JPA");
            card1.setCreatedAt(Instant.now());
            card1.setList(done);
            cardRepository.save(card1);

            Card card2 = new Card();
            card2.setTitle("Build drag-and-drop UI");
            card2.setDescription("Use @dnd-kit on the frontend");
            card2.setCreatedAt(Instant.now());
            card2.setList(inProgress);
            cardRepository.save(card2);

            Card card3 = new Card();
            card3.setTitle("Add WebSocket real-time sync");
            card3.setDescription("Broadcast card moves to all connected clients");
            card3.setCreatedAt(Instant.now());
            card3.setList(todo);
            cardRepository.save(card3);

            Card card4 = new Card();
            card4.setTitle("Deploy to Railway/Vercel");
            card4.setCreatedAt(Instant.now());
            card4.setList(todo);
            cardRepository.save(card4);

            System.out.println("Dummy data seeded.");
        };
    }
}