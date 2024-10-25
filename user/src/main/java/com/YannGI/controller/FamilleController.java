package com.YannGI.controller;

import com.YannGI.model.Famille;
import com.YannGI.service.FamilleService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FamilleController
{
    private final FamilleService familleService;

    public FamilleController(FamilleService familleService)
    {
        this.familleService = familleService;
    }

    @PostMapping("createFamille")
    public Famille createFamille(@RequestParam String nomFamille)
    {
        return familleService.createFamille(nomFamille);
    }
}
