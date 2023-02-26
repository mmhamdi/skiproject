package com.example.stationski.stationski.services;

import com.example.stationski.stationski.entities.Skieur;

import java.util.List;

public interface Iskieurservice {
    void add (Skieur s );
    Skieur update (Skieur s );
    List<Skieur> getAlL();
    Skieur getById (long id );
    void remove (long id );


}
