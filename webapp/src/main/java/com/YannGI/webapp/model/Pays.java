package com.YannGI.webapp.model;

public class Pays
{
    private Integer idPays;
    private String nomPays;

    public Pays() {
    }

    public Pays(Integer idPays, String nomPays) {
        this.idPays = idPays;
        this.nomPays = nomPays;
    }

    public Integer getIdPays() {
        return idPays;
    }

    public void setIdPays(Integer idPays) {
        this.idPays = idPays;
    }

    public String getNomPays() {
        return nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }
}
