package com.example.demo.controller;

import java.util.List;

import com.example.demo.entities.Prescription;
import com.example.demo.repositories.IPrescription;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/prescription")
public class PrescriptionController {
    
    
    @Autowired
    IPrescription prescription;

    @GetMapping(value="avoirTousLesPrescriptions")
    public List<Prescription> avoirTousLesPrescriptions() {
        return prescription.findAll();
    }

    @GetMapping(value="{id}")
    public Prescription avoirPrescription(@PathVariable(value="id") Long id) {
        return prescription.findById(id).get();
    }

    @GetMapping(value="supprimer/{id}")
    public void supprimerPrescription(@PathVariable(value="id") Long id) {
        prescription.deleteById(id);
    }
    
    
}
