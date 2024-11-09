package com.YannGI.mongo.controller;

import com.YannGI.mongo.model.InfosClassif;
import com.YannGI.mongo.service.InfosClassifService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoClassifController
{
    private final InfosClassifService infosClassifService;

    public InfoClassifController(InfosClassifService infosClassifService)
    {
        this.infosClassifService = infosClassifService;
    }

    @PostMapping("/createInfo")
    public InfosClassif createInfo (@RequestBody InfosClassif infosClassif)
    {
        infosClassifService.createInfo(infosClassif);
        return infosClassif;
    }
}
