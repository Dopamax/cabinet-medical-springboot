package com.example.demo.repositories;

import com.example.demo.entities.Medecins;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IMedecin extends JpaRepository<Medecins,Long>{
    
}
