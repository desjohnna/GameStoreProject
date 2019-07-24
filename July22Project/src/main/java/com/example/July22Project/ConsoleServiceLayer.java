package com.example.July22Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Console;
import java.util.List;

@Component
public class ConsoleServiceLayer {

    @Autowired
    ConsoleRepository consoleRepo;

    //CRUD Method calls
    public Consoles addConsole(Consoles consoles) {
        consoleRepo.save(consoles);
        return consoles;
    }

    public List<Consoles> consolesList() {
        return consoleRepo.findAll();
    }

    public Consoles getById(int id) {
        return consoleRepo.getOne(id);
    }

    public void updateConsole(Consoles consoles, int id) {
        if (consoles.getId() != id) {
            throw new IllegalArgumentException("No such ID exists, please enter a valid ID.");
        }
        consoleRepo.save(consoles);
    }

    public void deleteGame(int id) {
        consoleRepo.deleteById(id);
    }

    //Repository method
    public List<Consoles> findByManufacturer(String manufacturer) {
        return consoleRepo.findByManufactuerer(manufacturer);
    }


}
