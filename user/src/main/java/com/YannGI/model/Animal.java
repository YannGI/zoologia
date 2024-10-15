package com.YannGI.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Animal
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAnimal;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "jointure_lieux_animaux",
            joinColumns = @JoinColumn(name = "id_animal"),
            inverseJoinColumns = @JoinColumn(name = "id_lieux")
    )
    private List<Lieux> ListLieux;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_statut")
    private Statut idStatut;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_categorie")
    private Categorie idCategorie;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_famille")
    private Famille idFamille;
    private String statFavoris;
    private String nom;
    private String taille;
    private String regimAlim;
    private String description;
    private String poids;
    private String ppimage;

    public Animal() {
    }

    public Animal(Integer idAnimal, List<Lieux> listLieux, Statut idStatut, Categorie idCategorie, Famille idFamille, String statFavoris, String nom, String taille, String regimAlim, String description, String poids, String ppimage) {
        this.idAnimal = idAnimal;
        ListLieux = listLieux;
        this.idStatut = idStatut;
        this.idCategorie = idCategorie;
        this.idFamille = idFamille;
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

    public List<Lieux> getListLieux() {
        return ListLieux;
    }

    public void setListLieux(List<Lieux> listLieux) {
        ListLieux = listLieux;
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
