package com.example.stationski.stationski.services;

import com.example.stationski.stationski.entities.Cours;
import com.example.stationski.stationski.repo.CoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IcoursserviceImpl implements Icoursservice{
    @Autowired
    private CoursRepository coursRepository;
    @Override
    public List<Cours> retrieveAllCourses() {
        return coursRepository.findAll();
    }

    @Override
    public Cours addCours(Cours cours) {
        return null;
    }

    @Override
    public Cours updateCours(Cours cours) {
        return null;
    }

    @Override
    public Cours retrieveCours(Long numCours) {
        return null;
    }
}
