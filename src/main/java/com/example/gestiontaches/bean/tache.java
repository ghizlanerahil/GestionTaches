package com.example.gestiontaches.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity

public class tache implements Serializable {
@Id @GeneratedValue
    private  Long id;
    private String nom;
    private String description;
    private String etat;
    private String source;
    private String conditionFin;


    public tache() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getConditionFin() {
        return conditionFin;
    }

    public void setConditionFin(String conditionFin) {
        this.conditionFin = conditionFin;
    }

    public tache(Long id, String nom, String description, String etat, String source, String conditionFin) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.etat = etat;
        this.source = source;
        this.conditionFin = conditionFin;
    }

    @Override
    public String toString() {
        return "tache{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", etat='" + etat + '\'' +
                ", source='" + source + '\'' +
                ", conditionFin='" + conditionFin + '\'' +
                '}';
    }
}
