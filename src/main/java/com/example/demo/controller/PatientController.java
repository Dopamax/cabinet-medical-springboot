package com.example.demo.controller;

import java.util.List;

import com.example.demo.entities.Patients;
import com.example.demo.repositories.IPatient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "api/patient")
public class PatientController {
    @Autowired
    IPatient patient;

    @PostMapping(value="ajouter")
    public void ajouterPatient(@RequestBody Patients p) {
        patient.save(p);
    }

    @GetMapping(value="TousLesPatients")
    public List<Patients> avoirTousLesPatients() {
        return patient.findAll();
    }

    @GetMapping(value="{id}")
    public Patients avoirUnPatient(@PathVariable(value="id") Long id) {
        return patient.findById(id).get();
    }
    
    @GetMapping(value="supprimer/{id}")
    public void supprimerPatient(@PathVariable(value="id") Long id) {
        patient.deleteById(id);
    }
    
}
