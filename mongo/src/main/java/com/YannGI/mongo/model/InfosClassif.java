package com.YannGI.mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="infosClassif")
public class InfosClassif
{
    @Id
    private String idMongoClassif;
    private String categorieClassif;
    private String familleClassif;
    private String descriptionClassif;
    private String imageClassif;

    public InfosClassif() {
    }

    public InfosClassif(String idMongoClassif, String categorieClassif, String familleClassif, String descriptionClassif, String imageClassif) {
        this.idMongoClassif = idMongoClassif;
        this.categorieClassif = categorieClassif;
        this.familleClassif = familleClassif;
        this.descriptionClassif = descriptionClassif;
        this.imageClassif = imageClassif;
    }

    public String getIdMongoClassif() {
        return idMongoClassif;
    }

    public void setIdMongoClassif(String idMongoClassif) {
        this.idMongoClassif = idMongoClassif;
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
