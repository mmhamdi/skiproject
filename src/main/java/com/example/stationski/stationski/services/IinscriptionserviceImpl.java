package com.example.stationski.stationski.services;

import com.example.stationski.stationski.entities.Inscription;
import com.example.stationski.stationski.entities.Skieur;
import com.example.stationski.stationski.repo.InscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IinscriptionserviceImpl implements  Iinscriptionservice{


        @Autowired
    private InscriptionRepository inscriptionRepository ;


    @Override
    public void add(Inscription inscription) {
    inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription update(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public List<Inscription> getAlL() {
        return inscriptionRepository.findAll();
    }

    @Override
    public Inscription getById(long id) {
        return inscriptionRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(long id) {
        inscriptionRepository.deleteById(id);

    }
}
