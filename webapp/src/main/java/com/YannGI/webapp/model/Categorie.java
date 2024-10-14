package com.YannGI.webapp.model;

public class Categorie
{
    private Integer idcategorie;
    private String nomcategorie;

    public Categorie() {
    }

    public Categorie(Integer idcategorie, String nomcategorie) {
        this.idcategorie = idcategorie;
        this.nomcategorie = nomcategorie;
    }

    public Integer getIdcategorie() {
        return idcategorie;
    }

    public void setIdcategorie(Integer idcategorie) {
        this.idcategorie = idcategorie;
    }

    public String getNomcategorie() {
        return nomcategorie;
    }

    public void setNomcategorie(String nomcategorie) {
        this.nomcategorie = nomcategorie;
    }
}
