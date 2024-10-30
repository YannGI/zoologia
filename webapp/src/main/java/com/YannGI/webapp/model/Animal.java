package com.YannGI.webapp.model;


public class Animal
{
    private Integer idAnimal;
    private Statut idStatut;
    private Categorie idCategorie;
    private Famille idFamille;
    private Pays idPays;
    private String statFavoris;
    private String nom;
    private String taille;
    private String regimAlim;
    private String description;
    private String poids;
    private String ppimage;

    public Animal() {
    }

    public Animal(Integer idAnimal, Statut idStatut, Categorie idCategorie, Famille idFamille, Pays idPays, String statFavoris, String nom, String taille, String regimAlim, String description, String poids, String ppimage) {
        this.idAnimal = idAnimal;
        this.idStatut = idStatut;
        this.idCategorie = idCategorie;
        this.idFamille = idFamille;
        this.idPays = idPays;
        this.statFavoris = statFavoris;
        this.nom = nom;
        this.taille = taille;
        this.regimAlim = regimAlim;
        this.description = description;
        this.poids = poids;
        this.ppimage = ppimage;
    }

    public Integer getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Integer idAnimal) {
        this.idAnimal = idAnimal;
    }

    public Statut getIdStatut() {
        return idStatut;
    }

    public void setIdStatut(Statut idStatut) {
        this.idStatut = idStatut;
    }

    public Categorie getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(Categorie idCategorie) {
        this.idCategorie = idCategorie;
    }

    public Famille getIdFamille() {
        return idFamille;
    }

    public void setIdFamille(Famille idFamille) {
        this.idFamille = idFamille;
    }

    public Pays getIdPays() {
        return idPays;
    }

    public void setIdPays(Pays idPays) {
        this.idPays = idPays;
    }

    public String getStatFavoris() {
        return statFavoris;
    }

    public void setStatFavoris(String statFavoris) {
        this.statFavoris = statFavoris;
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

    public String getRegimAlim() {
        return regimAlim;
    }

    public void setRegimAlim(String regimAlim) {
        this.regimAlim = regimAlim;
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
