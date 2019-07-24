package com.example.July22Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ConsoleController {
    @Autowired
    ConsoleServiceLayer service;

    @RequestMapping(value = "/consoles", method = RequestMethod.GET)
    public List<Consoles> consolesList() {
        return service.consolesList();
    }

    @RequestMapping(value = "/consoles/{id}", method = RequestMethod.GET)
    public Consoles getConsoleById(@PathVariable int id) {
        return service.getById(id);
    }

    @RequestMapping(value = "/consoles", method = RequestMethod.POST)
    public void addConsole(@RequestBody @Valid Consoles console) {
        service.addConsole(console);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable int id) {
        service.deleteGame(id);
    }

    @RequestMapping(value = "/consoles/{id}", method = RequestMethod.PUT)
    public void updateConsole(@RequestBody @Valid Consoles console, @PathVariable int id) {
        service.updateConsole(console, id);
    }


}
