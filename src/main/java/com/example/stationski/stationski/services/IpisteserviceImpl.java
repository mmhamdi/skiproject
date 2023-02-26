package com.example.stationski.stationski.services;

import com.example.stationski.stationski.entities.Piste;
import com.example.stationski.stationski.repo.PisteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IpisteserviceImpl implements Ipisteservice  {


    @Autowired
    private PisteRepository pisteRepository;
    @Override
    public List<Piste> retrieveALLPistes() {
        return pisteRepository.findAll();
    }

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste ) ;
    }

    @Override
    public List<Piste> getAll() {return pisteRepository.findAll();}

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste getById(long id){
        return pisteRepository.findById(id).orElse(null);
    }

    @Override
    public void deletePiste(long id) {
        pisteRepository.deleteById(id);
    }
}
