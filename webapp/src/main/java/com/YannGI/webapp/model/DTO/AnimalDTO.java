package com.YannGI.webapp.model.DTO;

public class AnimalDTO {
    private String nomStatut;
    private String nomCategorie;
    private String nonFamille;
    private String nomPays;
    private String nom;
    private String taille;
    private String regimAlim;
    private String description;
    private String poids;
    private String ppImage;

    public AnimalDTO() {
    }

    public AnimalDTO(String nomStatut, String nomCategorie, String nonFamille, String nomPays, String nom, String taille, String regimAlim, String description, String poids, String ppImage) {
        this.nomStatut = nomStatut;
        this.nomCategorie = nomCategorie;
        this.nonFamille = nonFamille;
        this.nomPays = nomPays;
        this.nom = nom;
        this.taille = taille;
        this.regimAlim = regimAlim;
        this.description = description;
        this.poids = poids;
        this.ppImage = ppImage;
    }

    public String getNomStatut() {
        return nomStatut;
    }

    public void setNomStatut(String nomStatut) {
        this.nomStatut = nomStatut;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public String getNonFamille() {
        return nonFamille;
    }

    public void setNonFamille(String nonFamille) {
        this.nonFamille = nonFamille;
    }

    public String getNomPays() {
        return nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
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

    public String getPpImage() {
        return ppImage;
    }

    public void setPpImage(String ppImage) {
        this.ppImage = ppImage;
    }
}


