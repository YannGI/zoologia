package com.YannGI.webapp.model;

public class Statut
{
    private Integer idstatut;
    private String nomstatut;

    public Statut() {
    }

    public Statut(Integer idstatut, String nomstatut) {
        this.idstatut = idstatut;
        this.nomstatut = nomstatut;
    }

    public Integer getIdstatut() {
        return idstatut;
    }

    public void setIdstatut(Integer idstatut) {
        this.idstatut = idstatut;
    }

    public String getNomstatut() {
        return nomstatut;
    }

    public void setNomstatut(String nomstatut) {
        this.nomstatut = nomstatut;
    }
}
