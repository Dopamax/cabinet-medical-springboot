package com.example.demo.controller;

import java.util.List;

import com.example.demo.entities.consultations;
import com.example.demo.repositories.IConsultation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(path = "api/consultation")
public class ConsultationController {
    
    @Autowired
    IConsultation consultation;

    @GetMapping(value="avoirTousLesConsultations")
    public List<consultations> avoirTousLesConsultaions() {
        return consultation.findAll();
    }

    @GetMapping(value="{id}")
    public consultations avoirConsultation(@PathVariable(value="id") int id) {
        return consultation.findById(id).get();
    }

    @GetMapping(value="supprimer/{id}")
    public void supprimerConsultation(@PathVariable(value="id") int id) {
        consultation.deleteById(id);
    }
    
    
    
}
