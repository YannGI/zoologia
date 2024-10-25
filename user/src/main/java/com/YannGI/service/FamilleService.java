package com.YannGI.service;

import com.YannGI.model.Animal;
import com.YannGI.model.Famille;
import com.YannGI.repository.FamilleRepository;
import org.springframework.stereotype.Service;

@Service
public class FamilleService
{
    private final FamilleRepository familleRepository;

    public FamilleService(FamilleRepository familleRepository)
    {
        this.familleRepository = familleRepository;
    }

    public Famille createFamille(String nomFamille)
    {
        Famille famille = new Famille();
        famille.setNomFamille(nomFamille);
        return familleRepository.save(famille);
    }
}
