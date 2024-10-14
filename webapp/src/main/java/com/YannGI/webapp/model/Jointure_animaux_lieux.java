package com.YannGI.webapp.model;

public class Jointure_animaux_lieux
{
    private Integer idanimal;
    private Integer idlieux;

    public Jointure_animaux_lieux() {
    }

    public Jointure_animaux_lieux(Integer idanimal, Integer idlieux) {
        this.idanimal = idanimal;
        this.idlieux = idlieux;
    }

    public Integer getIdanimal() {
        return idanimal;
    }

    public void setIdanimal(Integer idanimal) {
        this.idanimal = idanimal;
    }

    public Integer getIdlieux() {
        return idlieux;
    }

    public void setIdlieux(Integer idlieux) {
        this.idlieux = idlieux;
    }
}
