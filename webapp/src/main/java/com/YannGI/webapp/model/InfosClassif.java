package com.YannGI.webapp.model;

public class InfosClassif
{
    private String categorieClassif;
    private String familleClassif;
    private String descriptionClassif;
    private String imageClassif;

    public InfosClassif() {
    }

    public InfosClassif(String categorieClassif, String familleClassif, String descriptionClassif, String imageClassif)
    {
        this.categorieClassif = categorieClassif;
        this.familleClassif = familleClassif;
        this.descriptionClassif = descriptionClassif;
        this.imageClassif = imageClassif;
    }

    public String getCategorieClassif() {
        return categorieClassif;
    }

    public void setCategorieClassif(String categorieClassif) {
        this.categorieClassif = categorieClassif;
    }

    public String getFamilleClassif() {
        return familleClassif;
    }

    public void setFamilleClassif(String familleClassif) {
        this.familleClassif = familleClassif;
    }

    public String getDescriptionClassif() {
        return descriptionClassif;
    }

    public void setDescriptionClassif(String descriptionClassif) {
        this.descriptionClassif = descriptionClassif;
    }

    public String getImageClassif() {
        return imageClassif;
    }

    public void setImageClassif(String imageClassif) {
        this.imageClassif = imageClassif;
    }
}
