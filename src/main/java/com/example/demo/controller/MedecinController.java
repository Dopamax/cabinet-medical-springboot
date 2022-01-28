package com.example.demo.controller;

import java.util.List;

import com.example.demo.entities.Medecins;
import com.example.demo.repositories.IMedecin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping(path = "api/medecin")
public class MedecinController {
    @Autowired
    IMedecin medecin;

    @GetMapping("{id}")
    public Medecins avoirUnMedecin(@PathVariable(value="id") Long id){
        return medecin.findById(id).get();
    }
    @GetMapping("TousLesMedecins")
    public List<Medecins> avoirTousLesMedecins(){
        return medecin.findAll();
    }
   
    @PostMapping(value="ajouter")
    public void ajouterUnMedecin(@RequestBody Medecins m){
        medecin.save(m);
    }

    @PostMapping(value="modifier/{id}")
    public void modifierMedecin(@RequestBody Medecins nouveau,@PathVariable(value="id") Long id){
        Medecins m=medecin.findById(id).get();
        m=nouveau;
        medecin.save(m);
    }

    @GetMapping(value="supprimer/{id}")
    public void supprimerMedecin(@PathVariable(value="id") Long id) {
        medecin.deleteById(id);
    }
    
    
}
