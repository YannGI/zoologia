package com.YannGI.mongo.service;

import com.YannGI.mongo.model.InfosClassif;
import com.YannGI.mongo.repository.InfosClassifRepository;
import org.springframework.stereotype.Service;

@Service
public class InfosClassifService
{
    private final InfosClassifRepository infosClassifRepository;

    public InfosClassifService(InfosClassifRepository infosClassifRepository)
    {
        this.infosClassifRepository = infosClassifRepository;
    }

    // ############### CREATE ####################
    public InfosClassif createInfo(InfosClassif infosClassif)
    {
        return infosClassifRepository.save(infosClassif);
    }
}
