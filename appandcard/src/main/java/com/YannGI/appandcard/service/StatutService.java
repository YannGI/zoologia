package com.YannGI.appandcard.service;

import com.YannGI.appandcard.model.Categorie;
import com.YannGI.appandcard.model.Statut;
import com.YannGI.appandcard.repository.CategorieRepository;
import com.YannGI.appandcard.repository.StatutRepository;
import org.springframework.stereotype.Service;

@Service
public class StatutService
{
    private final StatutRepository statutRepository;

    public StatutService(StatutRepository statutRepository)
    {
        this.statutRepository = statutRepository;
    }

    public Statut createStatut(String nomStatut)
    {
        Statut statut = new Statut();
        statut.setNomStatut(nomStatut);
        return statutRepository.save(statut);
    }
}
