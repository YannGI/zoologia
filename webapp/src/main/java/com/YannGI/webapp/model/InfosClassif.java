package com.YannGI.webapp.model;

public class InfosClassif
{
    private String idInfosClassif;
    private String statutClassif;
    private String familleClassif;
    private String categorieVertebreClassif;
    private String categorieArthropodeClassif;
    private String categorieMollusqueClassif;
    private String imageClassif;

    public InfosClassif() {
    }

    public InfosClassif(String idInfosClassif, String statutClassif, String familleClassif, String categorieVertebreClassif, String categorieArthropodeClassif, String categorieMollusqueClassif, String imageClassif) {
        this.idInfosClassif = idInfosClassif;
        this.statutClassif = statutClassif;
        this.familleClassif = familleClassif;
        this.categorieVertebreClassif = categorieVertebreClassif;
        this.categorieArthropodeClassif = categorieArthropodeClassif;
        this.categorieMollusqueClassif = categorieMollusqueClassif;
        this.imageClassif = imageClassif;
    }

    public String getIdInfosClassif() {
        return idInfosClassif;
    }

    public void setIdInfosClassif(String idInfosClassif) {
        this.idInfosClassif = idInfosClassif;
    }

    public String getStatutClassif() {
        return statutClassif;
    }

    public void setStatutClassif(String statutClassif) {
        this.statutClassif = statutClassif;
    }

    public String getFamilleClassif() {
        return familleClassif;
    }

    public void setFamilleClassif(String familleClassif) {
        this.familleClassif = familleClassif;
    }

    public String getCategorieVertebreClassif() {
        return categorieVertebreClassif;
    }

    public void setCategorieVertebreClassif(String categorieVertebreClassif) {
        this.categorieVertebreClassif = categorieVertebreClassif;
    }

    public String getCategorieArthropodeClassif() {
        return categorieArthropodeClassif;
    }

    public void setCategorieArthropodeClassif(String categorieArthropodeClassif) {
        this.categorieArthropodeClassif = categorieArthropodeClassif;
    }

    public String getCategorieMollusqueClassif() {
        return categorieMollusqueClassif;
    }

    public void setCategorieMollusqueClassif(String categorieMollusqueClassif) {
        this.categorieMollusqueClassif = categorieMollusqueClassif;
    }

    public String getImageClassif() {
        return imageClassif;
    }

    public void setImageClassif(String imageClassif) {
        this.imageClassif = imageClassif;
    }
}
