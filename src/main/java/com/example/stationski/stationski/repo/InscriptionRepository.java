package com.example.stationski.stationski.repo;

import com.example.stationski.stationski.entities.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionRepository extends JpaRepository<Inscription,Long> {
}
