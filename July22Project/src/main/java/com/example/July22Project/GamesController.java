package com.example.July22Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class GamesController {


    @Autowired
    private GamesServiceLayer service;


    @RequestMapping(value = "/games", method = RequestMethod.GET)
    public List<Games> gameList() {
        return service.gameList();
    }

    @RequestMapping(value = "/games/{id}", method = RequestMethod.GET)
    public Games getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @RequestMapping(value = "/games", method = RequestMethod.POST)
    public Games addGame(@RequestBody @Valid Games game) {
        service.addGame(game);
        return game;
    }

    @RequestMapping(value = "/games/{id}", method = RequestMethod.PUT)
    public void updateGame(@RequestBody @Valid Games game, @PathVariable Integer id) {

        service.updateGame(game, id);
    }

    @RequestMapping(value = "/games/{id}", method = RequestMethod.DELETE)
    public void deletebyId(@PathVariable Integer id) {
        service.deleteGame(id);
    }


}
