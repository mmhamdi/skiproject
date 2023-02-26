package com.example.stationski.stationski.services;

import com.example.stationski.stationski.entities.Inscription;
import com.example.stationski.stationski.entities.Skieur;

import java.util.List;

public interface Iinscriptionservice
{
    void add (Inscription inscription);
    Inscription update (Inscription inscription );
    List<Inscription> getAlL();
    Inscription getById (long id );
    void remove (long id );
}
