package com.YannGI.appandcard.service;

import com.YannGI.appandcard.model.Famille;
import com.YannGI.appandcard.model.Pays;
import com.YannGI.appandcard.repository.PaysRepository;
import org.springframework.stereotype.Service;

@Service
public class PaysService
{
    private final PaysRepository paysRepository;

    public PaysService(PaysRepository paysRepository)
    {
        this.paysRepository = paysRepository;
    }

    public Pays createPays (String nomPays)
    {
        Pays pays = new Pays();
        pays.setNomPays(nomPays);
        return paysRepository.save(pays);
    }
}
