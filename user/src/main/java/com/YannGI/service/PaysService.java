package com.YannGI.service;

import com.YannGI.model.Famille;
import com.YannGI.model.Pays;
import com.YannGI.repository.FamilleRepository;
import com.YannGI.repository.PaysRepository;
import org.springframework.stereotype.Service;

@Service
public class PaysService
{
    private final PaysRepository paysRepository;

    public PaysService(PaysRepository paysRepository)
    {
        this.paysRepository = paysRepository;
    }

    public Pays createPays(String nomPays)
    {
        Pays pays = new Pays();
        pays.setNomPays(nomPays);
        return paysRepository.save(pays);
    }
}
