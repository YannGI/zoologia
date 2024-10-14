package com.YannGI.webapp.model;

public class Animal
{
    private Integer idanimal;
    private Integer idstatut;
    private Integer idcategorie;
    private Integer idfamille;
    private String statfavoris;
    private String nom;
    private String taille;
    private String regimalim;
    private String description;
    private String poids;
    private String ppimage;

    public Animal() {
    }

    public Animal(Integer idanimal, Integer idstatut, Integer idcategorie, Integer idfamille, String statfavoris, String nom, String taille, String regimalim, String description, String poids, String ppimage) {
        this.idanimal = idanimal;
        this.idstatut = idstatut;
        this.idcategorie = idcategorie;
        this.idfamille = idfamille;
        this.statfavoris = statfavoris;
        this.nom = nom;
        this.taille = taille;
        this.regimalim = regimalim;
        this.description = description;
        this.poids = poids;
        this.ppimage = ppimage;
    }

    public Integer getIdanimal() {
        return idanimal;
    }

    public void setIdanimal(Integer idanimal) {
        this.idanimal = idanimal;
    }

    public Integer getIdstatut() {
        return idstatut;
    }

    public void setIdstatut(Integer idstatut) {
        this.idstatut = idstatut;
    }

    public Integer getIdcategorie() {
        return idcategorie;
    }

    public void setIdcategorie(Integer idcategorie) {
        this.idcategorie = idcategorie;
    }

    public Integer getIdfamille() {
        return idfamille;
    }

    public void setIdfamille(Integer idfamille) {
        this.idfamille = idfamille;
    }

    public String getStatfavoris() {
        return statfavoris;
    }

    public void setStatfavoris(String statfavoris) {
        this.statfavoris = statfavoris;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public String getRegimalim() {
        return regimalim;
    }

    public void setRegimalim(String regimalim) {
        this.regimalim = regimalim;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPoids() {
        return poids;
    }

    public void setPoids(String poids) {
        this.poids = poids;
    }

    public String getPpimage() {
        return ppimage;
    }

    public void setPpimage(String ppimage) {
        this.ppimage = ppimage;
    }
}

