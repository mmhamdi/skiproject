package com.example.stationski.stationski.services;

import com.example.stationski.stationski.entities.Moniteur;
import com.example.stationski.stationski.entities.Piste;
import com.example.stationski.stationski.repo.MoniteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImoniteurserviceImpl implements Imoniteurservice {
    @Autowired
    private MoniteurRepository moniteurRepository;


    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public List<Moniteur> getAll() {
        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur getById(long id) {
        return moniteurRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteMoniteur(long id) {

    }
}
