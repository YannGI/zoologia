package com.YannGI.webapp.model;

public class Famille
{
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
