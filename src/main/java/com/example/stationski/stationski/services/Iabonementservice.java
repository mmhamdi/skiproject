package com.example.stationski.stationski.services;

import com.example.stationski.stationski.entities.Abonnement;
import com.example.stationski.stationski.entities.Skieur;

import java.util.List;

public interface Iabonementservice {
    void add (Abonnement abonnement );
    Abonnement update (Abonnement abonnement);
    List<Abonnement> getAlL();
    Abonnement getById (long id );
    void remove (long id );
}
