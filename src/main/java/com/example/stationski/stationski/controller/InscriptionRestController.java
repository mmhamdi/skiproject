package com.example.stationski.stationski.controller;

import com.example.stationski.stationski.entities.Inscription;
import com.example.stationski.stationski.entities.Skieur;
import com.example.stationski.stationski.services.Iinscriptionservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inscription")
public class InscriptionRestController {
@Autowired
    public Iinscriptionservice iinscriptionservice;
    @PostMapping("/add")
    public void add(@RequestBody Inscription inscription) {
        iinscriptionservice.add(inscription);
    }

    @PutMapping("/update")
    public Inscription update(@RequestBody Inscription inscription) {
        return iinscriptionservice.update(inscription);
    }

    @GetMapping("/all")
    public List<Inscription> getAll() {
        return iinscriptionservice.getAlL();
    }

    @GetMapping("/{id}")
    public Inscription getById(@PathVariable long id) {
        return iinscriptionservice.getById(id);
    }

    @DeleteMapping("/remove/{id}")
    public void remove(@PathVariable long id) {
        iinscriptionservice.remove(id);
    }

}
