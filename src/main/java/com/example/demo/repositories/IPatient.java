package com.example.demo.repositories;

import com.example.demo.entities.Patients;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatient extends JpaRepository<Patients,Long>{
    
}
