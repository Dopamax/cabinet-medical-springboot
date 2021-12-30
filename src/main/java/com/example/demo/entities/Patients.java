package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Patients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_patient;
    private String nom_patient;
    private String prenom_patient;
    private String cin_patient;
    private String login_p;
    private String password_p;
    private String date_naiss;
    private String lieu_naiss;
    private String telephone;
    
    public Long getId_patient() {
        return id_patient;
    }
    public void setId_patient(Long id_patient) {
        this.id_patient = id_patient;
    }
    public String getNom_patient() {
        return nom_patient;
    }
    public void setNom_patient(String nom_patient) {
        this.nom_patient = nom_patient;
    }
    public String getPrenom_patient() {
        return prenom_patient;
    }
    public void setPrenom_patient(String prenom_patient) {
        this.prenom_patient = prenom_patient;
    }
    public String getCin_patient() {
        return cin_patient;
    }
    public void setCin_patient(String cin_patient) {
        this.cin_patient = cin_patient;
    }
    public String getLogin_p() {
        return login_p;
    }
    public void setLogin_p(String login_p) {
        this.login_p = login_p;
    }
    public String getPassword_p() {
        return password_p;
    }
    public void setPassword_p(String password_p) {
        this.password_p = password_p;
    }
    public String getDate_naiss() {
        return date_naiss;
    }
    public void setDate_naiss(String date_naiss) {
        this.date_naiss = date_naiss;
    }
    public String getLieu_naiss() {
        return lieu_naiss;
    }
    public void setLieu_naiss(String lieu_naiss) {
        this.lieu_naiss = lieu_naiss;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public Patients(String nom_patient, String prenom_patient, String cin_patient, String login_p,
            String password_p, String date_naiss, String lieu_naiss, String telephone) {
        this.nom_patient = nom_patient;
        this.prenom_patient = prenom_patient;
        this.cin_patient = cin_patient;
        this.login_p = login_p;
        this.password_p = password_p;
        this.date_naiss = date_naiss;
        this.lieu_naiss = lieu_naiss;
        this.telephone = telephone;
    }
    public Patients() {
    }

    
}
