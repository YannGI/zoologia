package com.YannGI.webapp.service.client;



import com.YannGI.webapp.model.Utilisateur;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@FeignClient("utilisateur")
public interface UtilisateurFeignClient
{
    @RequestMapping(method = RequestMethod.POST, value = "/saveUser", consumes = "application/json")
    Utilisateur saveUser (@RequestBody Utilisateur utilisateur1);

    @RequestMapping(method = RequestMethod.POST, value = "/findUserByEmail", consumes = "application/json")
    Optional<Utilisateur> findUserByEmail (@RequestBody String email);
}
