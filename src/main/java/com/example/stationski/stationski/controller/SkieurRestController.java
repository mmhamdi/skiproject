package com.example.stationski.stationski.controller;

import com.example.stationski.stationski.entities.Skieur;
import com.example.stationski.stationski.services.Iskieurservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skieurs")
public class SkieurRestController {
    @Autowired
    private Iskieurservice skieurService;

    @PostMapping("/add")
    public void add(@RequestBody Skieur skieur) {
        skieurService.add(skieur);
    }

    @PutMapping("/update")
    public Skieur update(@RequestBody Skieur skieur) {
        return skieurService.update(skieur);
    }

    @GetMapping("/all")
    public List<Skieur> getAll() {
        return skieurService.getAlL();
    }

    @GetMapping("/{id}")
    public Skieur getById(@PathVariable long id) {
        return skieurService.getById(id);
    }

    @DeleteMapping("/remove/{id}")
    public void remove(@PathVariable long id) {
        skieurService.remove(id);
    }

}
