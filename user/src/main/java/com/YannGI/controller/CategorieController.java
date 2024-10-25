package com.YannGI.controller;

import com.YannGI.model.Categorie;
import com.YannGI.service.CategorieService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategorieController
{
    private final CategorieService categorieService;

    public CategorieController(CategorieService categorieService)
    {
        this.categorieService = categorieService;
    }

    @PostMapping("createCategorie")
    public Categorie createCategorie(@RequestBody String nomCategorie)
    {
        return categorieService.createCategorie(nomCategorie);
    }
}
