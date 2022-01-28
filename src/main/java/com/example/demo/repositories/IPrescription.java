package com.example.demo.repositories;

import com.example.demo.entities.Prescription;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IPrescription extends JpaRepository<Prescription, Long> {
    
}
