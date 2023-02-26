package com.example.stationski.stationski.controller;

import com.example.stationski.stationski.entities.Cours;
import com.example.stationski.stationski.entities.Skieur;
import com.example.stationski.stationski.services.Icoursservice;
import com.example.stationski.stationski.services.Iskieurservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Cours")
public class CoursRestController  {


        @Autowired
        private Icoursservice icoursservice;

        @PostMapping("/add")
        public void add(@RequestBody Cours cours) {
            icoursservice.add(cours);
        }

        @PutMapping("/update")
        public Cours update(@RequestBody Cours cours) {
            return icoursservice.update (cours);
        }

        @GetMapping("/all")
        public List<Cours> getAll() {
            return icoursservice.getAlL();
        }

        @GetMapping("/{id}")
        public Cours getById(@PathVariable long id) {
            return icoursservice.getById(id);
        }

        @DeleteMapping("/remove/{id}")
        public void remove(@PathVariable long id) {
            icoursservice.remove(id);
        }

    }
