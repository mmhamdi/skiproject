package com.example.stationski.stationski.services;

import com.example.stationski.stationski.entities.Abonnement;
import com.example.stationski.stationski.repo.AbonementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IabonementserviceImpl implements  Iabonementservice{
   @Autowired
    private AbonementRepository abonementRepository;
    @Override
    public void add(Abonnement abonnement) {

    }

    @Override
    public Abonnement update(Abonnement abonnement) {
        return abonementRepository.save(abonnement);
    }

    @Override
    public List<Abonnement> getAlL() {
        return abonementRepository.findAll();
    }

    @Override
    public Abonnement getById(long id) {
        return abonementRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(long id) {
        abonementRepository.deleteById(id);
    }
}
