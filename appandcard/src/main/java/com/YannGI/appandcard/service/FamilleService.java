package com.YannGI.appandcard.service;

import com.YannGI.appandcard.model.Categorie;
import com.YannGI.appandcard.model.Famille;
import com.YannGI.appandcard.repository.FamilleRepository;
import org.springframework.stereotype.Service;

@Service
public class FamilleService
{
    private final FamilleRepository familleRepository;

    public FamilleService(FamilleRepository familleRepository)
    {
        this.familleRepository = familleRepository;
    }

    public Famille createFamille( String nomFamille)
    {
        Famille famille = new Famille();
        famille.setNomFamille(nomFamille);
        return familleRepository.save(famille);
    }
}
