package com.example.stationski.stationski.services;

import com.example.stationski.stationski.entities.Moniteur;
import com.example.stationski.stationski.entities.Piste;

import java.util.List;

public interface Imoniteurservice  {
    Moniteur addMoniteur(Moniteur moniteur );
    List<Moniteur> getAll ();
    Moniteur updateMoniteur (Moniteur moniteur) ;
    public Moniteur  getById(long id) ;
    void deleteMoniteur (long id );



}
