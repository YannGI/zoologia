package com.YannGI.service;

import com.YannGI.model.Categorie;
import com.YannGI.model.Famille;
import com.YannGI.repository.CategorieRepository;
import org.springframework.stereotype.Service;

@Service
public class CategorieService
{
    private final CategorieRepository categorieRepository;

    public CategorieService(CategorieRepository categorieRepository)
    {
        this.categorieRepository = categorieRepository;
    }

    public Categorie createCategorie(String nomCategorie)
    {
        Categorie categorie = new Categorie();
        categorie.setNomCategorie(nomCategorie);
        return categorieRepository.save(categorie);
    }
}
