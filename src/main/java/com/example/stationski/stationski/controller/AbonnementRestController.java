package com.example.stationski.stationski.controller;

import com.example.stationski.stationski.entities.Abonnement;
import com.example.stationski.stationski.entities.Skieur;
import com.example.stationski.stationski.services.Iabonementservice;
import com.example.stationski.stationski.services.Iskieurservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/abonnement")
public class AbonnementRestController {
    @Autowired
    private Iabonementservice iabonementservice;

    @PostMapping("/add")
    public void add(@RequestBody Abonnement abonnement) {
        iabonementservice.add(abonnement);
    }

    @PutMapping("/update")
    public Abonnement update(@RequestBody Abonnement abonnement) {
        return iabonementservice.update(abonnement);
    }

    @GetMapping("/all")
    public List<Abonnement> getAll() {
        return iabonementservice.getAlL();
    }

    @GetMapping("/{id}")
    public Abonnement getById(@PathVariable long id) {
        return iabonementservice.getById(id);
    }

    @DeleteMapping("/remove/{id}")
    public void remove(@PathVariable long id) {
        iabonementservice.remove(id);
    }

}
