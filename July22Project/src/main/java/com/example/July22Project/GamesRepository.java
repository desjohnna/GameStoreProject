package com.example.July22Project;

import com.example.July22Project.Games;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GamesRepository extends JpaRepository<Games, Integer> {

    List<Games> findByStudio(String studio);

    List<Games> findbyESRBRating(String esrbRating);

    List<Games> findByTitle (String title);


}
