package com.YannGI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Statut
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idStatut;
    private String nomStatut;

    public Statut() {
    }

    public Statut(Integer idStatut, String nomStatut) {
        this.idStatut = idStatut;
        this.nomStatut = nomStatut;
    }

    public Integer getIdStatut() {
        return idStatut;
    }

    public void setIdStatut(Integer idStatut) {
        this.idStatut = idStatut;
    }

    public String getNomStatut() {
        return nomStatut;
    }

    public void setNomStatut(String nomStatut) {
        this.nomStatut = nomStatut;
    }
}
