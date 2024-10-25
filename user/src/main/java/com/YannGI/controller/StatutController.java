package com.YannGI.controller;

import com.YannGI.model.Statut;
import com.YannGI.service.StatutService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatutController
{
    private final StatutService statutService;

    public StatutController(StatutService statutService)
    {
        this.statutService = statutService;
    }

    @PostMapping("createStatut")
    public Statut createStatut(@RequestBody String nomStatut)
    {
        return statutService.createStatut(nomStatut);
    }
}
