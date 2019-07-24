package com.example.July22Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GamesServiceLayer {
    @Autowired
    GamesRepository gameRepo;

    //CRUD Method calls
    public Games addGame(Games game) {
        gameRepo.save(game);
        return game;
    }

    public List<Games> gameList() {
        return gameRepo.findAll();
    }

    public Games getById(int id) {
        return gameRepo.getOne(id);
    }

    public void updateGame(Games game, int id) {
        if (game.getGameId() != id) {
            throw new IllegalArgumentException("No such ID exists, please enter a valid ID.");
        }
        gameRepo.save(game);
    }

    public void deleteGame(int id) {
        gameRepo.deleteById(id);
    }

    //Repository methods
    public List<Games> findByStudio(String studio) {
        return gameRepo.findByStudio(studio);
    }

    List<Games> findbyESRBRating(String esrbRating) {
        return gameRepo.findbyESRBRating(esrbRating);
    }

    List<Games> findByTitle(String title) {
        return gameRepo.findByTitle(title);
    }


}
