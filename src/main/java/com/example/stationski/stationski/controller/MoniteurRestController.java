package com.example.stationski.stationski.controller;

import com.example.stationski.stationski.entities.Moniteur;
import com.example.stationski.stationski.entities.Skieur;
import com.example.stationski.stationski.services.Imoniteurservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Moniteur")
public class MoniteurRestController {
    @Autowired
    private Imoniteurservice imoniteurservice;
    @PostMapping ("/add")
    public void add(@RequestBody Moniteur moniteur) {
    imoniteurservice.addMoniteur(moniteur);
}
    @PutMapping("/update")
    public Moniteur update(@RequestBody Moniteur moniteur) {
        return imoniteurservice.updateMoniteur(moniteur);
    }
    @GetMapping("/all")
    public List<Moniteur> getAll() {
        return imoniteurservice.getAll();
    }
    @GetMapping("/{id}")
    public Moniteur getById(@PathVariable long id) {
        return imoniteurservice.getById(id);
    }

    @DeleteMapping("/remove/{id}")
    public void remove(@PathVariable long id) {
        imoniteurservice.deleteMoniteur(id);
    }
}
