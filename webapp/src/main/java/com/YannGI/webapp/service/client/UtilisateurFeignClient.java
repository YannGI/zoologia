package com.YannGI.webapp.service.client;

import com.YannGI.webapp.model.Utilisateur;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient("utilisateur")
public interface UtilisateurFeignClient
{
    @PostMapping( value = "/saveUser", consumes = "application/json")
    public ResponseEntity<Utilisateur> saveUser (@RequestBody Utilisateur utilisateur);

    @PostMapping( value = "/findUserByEmail", consumes = "application/json")
    public ResponseEntity<Utilisateur> findUserByEmail (@RequestParam String email);
}
