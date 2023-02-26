package com.example.stationski.stationski.services;

import com.example.stationski.stationski.entities.Skieur;
import com.example.stationski.stationski.repo.SkieurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IskieurserviceImpl implements Iskieurservice {

    @Autowired
        private SkieurRepository skieurRepository;


    @Override
    public void add(Skieur s) {
        skieurRepository.save(s) ;
    }

    @Override
    public Skieur update(Skieur s) {
        return skieurRepository.save(s);
    }

    @Override
    public List<Skieur> getAlL() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur getById(long id) {
        return skieurRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(long id) {
        skieurRepository.deleteById(id);
    }
}
