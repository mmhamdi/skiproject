package com.example.stationski.stationski.controller;

import com.example.stationski.stationski.entities.Piste;
import com.example.stationski.stationski.services.Ipisteservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/piste")
public class PisteRestController {
    @Autowired
    private Ipisteservice pisteService;
    @PostMapping("/add")
    public void add(@RequestBody Piste piste) {pisteService.addPiste(piste);}
    @PutMapping ("/update")
    public void update (@RequestBody Piste piste ) {pisteService.updatePiste(piste);}
    @GetMapping(value = "/all")
    public List<Piste>getAll(){return pisteService.getAll();}
    @GetMapping ("{/id}")
                public Piste getById(@PathVariable long id) {
        return pisteService.getById(id);
    }
    @DeleteMapping ("/remove/{id}")
    public void remove(@PathVariable long id) {
        pisteService.deletePiste(id);
    }

    }

