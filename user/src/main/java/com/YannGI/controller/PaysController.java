package com.YannGI.controller;

import com.YannGI.model.Pays;
import com.YannGI.service.PaysService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaysController
{
    private final PaysService paysService;

    public PaysController(PaysService paysService)
    {
        this.paysService = paysService;
    }

    @PostMapping("createPays")
    public Pays createPays(@RequestBody String nomPays)
    {
        return paysService.createPays(nomPays);
    }
}
