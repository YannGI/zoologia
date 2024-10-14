package com.YannGI.webapp.model;

public class Pays
{
    private Integer idpays;
    private String nompays;

    public Pays() {
    }

    public Pays(Integer idpays, String nompays) {
        this.idpays = idpays;
        this.nompays = nompays;
    }

    public Integer getIdpays() {
        return idpays;
    }

    public void setIdpays(Integer idpays) {
        this.idpays = idpays;
    }

    public String getNompays() {
        return nompays;
    }

    public void setNompays(String nompays) {
        this.nompays = nompays;
    }
}
