package com.example.stationski.stationski.services;

import com.example.stationski.stationski.entities.Piste;

import java.util.List;

public interface Ipisteservice  {
    List<Piste> retrieveALLPistes ();
    Piste addPiste(Piste piste );
    List<Piste> getAll ();
    Piste updatePiste (Piste piste) ;
    public Piste  getById(long id) ;
    void deletePiste (long id );
}
