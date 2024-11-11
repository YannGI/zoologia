package com.YannGI.mongoinfo.service;

import com.YannGI.mongoinfo.model.InfosClassif;
import com.YannGI.mongoinfo.repository.InfosClassifRepository;
import org.springframework.stereotype.Service;

@Service
public class InfosCassifService
{
    private final InfosClassifRepository infosClassifRepository;

    public InfosCassifService(InfosClassifRepository infosClassifRepository)
    {
        this.infosClassifRepository = infosClassifRepository;
    }

    // ############### CREATE ####################
    public InfosClassif createInfo(InfosClassif infosClassif)
    {
        return infosClassifRepository.save(infosClassif);
    }
}
