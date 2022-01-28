package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Prescription {
    
    @Id
    @GeneratedValue
    private Long id;
    private String text_prescription;
    @OneToOne
    private consultations consultation;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getText_prescription() {
        return text_prescription;
    }
    public void setText_prescription(String text_prescription) {
        this.text_prescription = text_prescription;
    }
    public consultations getConsultation() {
        return consultation;
    }
    public void setConsultation(consultations consultation) {
        this.consultation = consultation;
    }
    public Prescription(Long id, String text_prescription, consultations consultation) {
        this.id = id;
        this.text_prescription = text_prescription;
        this.consultation = consultation;
    }
    public Prescription(String text_prescription, consultations consultation) {
        this.text_prescription = text_prescription;
        this.consultation = consultation;
    }
    public Prescription() {
    }

    
    
}
