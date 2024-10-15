package com.YannGI.webapp.model;

public class Lieux
{
    private Integer idlieux;
    private Pays idPays;
    private String nomLieu;
    private String gps;

    public Lieux() {
    }

    public Lieux(Integer idlieux, Pays idPays, String nomLieu, String gps) {
        this.idlieux = idlieux;
        this.idPays = idPays;
        this.nomLieu = nomLieu;
        this.gps = gps;
    }

    public Integer getIdlieux() {
        return idlieux;
    }

    public void setIdlieux(Integer idlieux) {
        this.idlieux = idlieux;
    }

    public Pays getIdPays() {
        return idPays;
    }

    public void setIdPays(Pays idPays) {
        this.idPays = idPays;
    }

    public String getNomLieu() {
        return nomLieu;
    }

    public void setNomLieu(String nomLieu) {
        this.nomLieu = nomLieu;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }
}