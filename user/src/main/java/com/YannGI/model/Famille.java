package com.YannGI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Famille
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFamille;
    private String nomFamille;

    public Famille() {
    }

    public Famille(Integer idFamille, String nomFamille) {
        this.idFamille = idFamille;
        this.nomFamille = nomFamille;
    }

    public Integer getIdFamille() {
        return idFamille;
    }

    public void setIdFamille(Integer idFamille) {
        this.idFamille = idFamille;
    }

    public String getNomFamille() {
        return nomFamille;
    }

    public void setNomFamille(String nomFamille) {
        this.nomFamille = nomFamille;
    }
}
