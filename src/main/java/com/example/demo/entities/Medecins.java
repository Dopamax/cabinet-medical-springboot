package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;

@Entity
public class Medecins {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom_medecin;
    private String prenom_medecin;
    private String specialite;
    private String login_m;
    private String password_m;
    
    public Long getId_medecin() {
        return id;
    }
    public void setId_medecin(Long id_medecin) {
        this.id = id_medecin;
    }
    public String getNom_medecin() {
        return nom_medecin;
    }
    public void setNom_medecin(String nom_medecin) {
        this.nom_medecin = nom_medecin;
    }
    public String getPrenom_medecin() {
        return prenom_medecin;
    }
    public void setPrenom_medecin(String prenom_medecin) {
        this.prenom_medecin = prenom_medecin;
    }
    public String getSpecialite() {
        return specialite;
    }
    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    public String getLogin_m() {
        return login_m;
    }
    public void setLogin_m(String login_m) {
        this.login_m = login_m;
    }
    public String getPassword_m() {
        return password_m;
    }
    public void setPassword_m(String password_m) {
        this.password_m = password_m;
    }
    public Medecins( String nom_medecin, String prenom_medecin, String specialite, String login_m,
            String password_m) {
        this.nom_medecin = nom_medecin;
        this.prenom_medecin = prenom_medecin;
        this.specialite = specialite;
        this.login_m = login_m;
        this.password_m = password_m;
    }
    
    public Medecins() {
    }

    

}
