package com.example.gestiontaches.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Responsable implements Serializable {
    @Id
    @GeneratedValue
    private  Long id;
    private String nom;
    private String prenom;
    private String tel;
    private String email;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    public Responsable() {
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Responsable(Long id, String nom, String prenom, String tel, String email, Date dateNaissance) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.email = email;
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return "Responsable{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", dateNaissance=" + dateNaissance +
                '}';
    }
}
