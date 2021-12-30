package com.example.demo.controller;

import java.util.List;

import com.example.demo.entities.Medecins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/medecin")
public class MedecinController {

    @GetMapping
    public List<Medecins> hello(){
        return List.of(new Medecins(
            "ahmed",
            "salmi",
            "Dermatologue",
            "ahmed",
            "55555555"

        ));
    }
}
