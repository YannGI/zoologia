package com.YannGI.mongoinfo.controller;

import com.YannGI.mongoinfo.model.InfosClassif;
import com.YannGI.mongoinfo.service.InfosCassifService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InfosClassifController
{
    private final InfosCassifService infosCassifService;

    public InfosClassifController(InfosCassifService infosCassifService)
    {
        this.infosCassifService = infosCassifService;
    }

    @PostMapping("/createInfo")
    public InfosClassif createInfo (@RequestBody InfosClassif infosClassif)
    {
        infosCassifService.createInfo(infosClassif);
        return infosClassif;
    }

    @GetMapping("/getInfosClassif")
    public InfosClassif getInfosClassif()
    {
        return infosCassifService.findInfosClassif();
    }
}
