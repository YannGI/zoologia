package com.YannGI.service;

import com.YannGI.model.Statut;
import com.YannGI.repository.StatutRepository;
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
