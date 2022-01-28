package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class consultations {
    @Id
    @GeneratedValue
    private int id;
    private Date date_consultation;
    private String motif;
    @OneToOne
    private Patients patient;
    @OneToOne
    private Medecins medecin;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getDate_consultation() {
        return date_consultation;
    }
    public void setDate_consultation(Date date_consultation) {
        this.date_consultation = date_consultation;
    }
    public String getMotif() {
        return motif;
    }
    public void setMotif(String motif) {
        this.motif = motif;
    }
    public Patients getPatient() {
        return patient;
    }
    public void setPatient(Patients patient) {
        this.patient = patient;
    }
    public Medecins getMedecin() {
        return medecin;
    }
    public void setMedecin(Medecins medecin) {
        this.medecin = medecin;
    }
    public consultations(int id, Date date_consultation, String motif, Patients patient, Medecins medecin) {
        this.id = id;
        this.date_consultation = date_consultation;
        this.motif = motif;
        this.patient = patient;
        this.medecin = medecin;
    }

    public consultations() {
    }
    public consultations(Date date_consultation, String motif, Patients patient, Medecins medecin) {
        this.date_consultation = date_consultation;
        this.motif = motif;
        this.patient = patient;
        this.medecin = medecin;
    }

    
    

}
