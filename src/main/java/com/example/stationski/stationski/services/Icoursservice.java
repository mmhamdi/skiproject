package com.example.stationski.stationski.services;

import com.example.stationski.stationski.entities.Cours;
import com.example.stationski.stationski.entities.Inscription;

import java.util.List;

public interface Icoursservice {
    void add (Cours cours);
    Cours update (Cours cours);
    List<Cours> getAlL();
    Cours getById (long id );
    void remove (long id );
}
