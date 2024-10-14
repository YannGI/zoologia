package com.YannGI.webapp.model;

public class Famille
{
    private Integer idfamille;
    private String nomfamille;

    public Famille() {
    }

    public Famille(Integer idfamille, String nomfamille) {
        this.idfamille = idfamille;
        this.nomfamille = nomfamille;
    }

    public Integer getIdfamille() {
        return idfamille;
    }

    public void setIdfamille(Integer idfamille) {
        this.idfamille = idfamille;
    }

    public String getNomfamille() {
        return nomfamille;
    }

    public void setNomfamille(String nomfamille) {
        this.nomfamille = nomfamille;
    }
}
