package com.YannGI.webapp.service;

import com.YannGI.webapp.model.Utilisateur;
import com.YannGI.webapp.service.client.AppandcardFeignClient;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class SessionService
{
    private final AppandcardFeignClient appandcardFeignClient;

    public SessionService(AppandcardFeignClient appandcardFeignClient)
    {
        this.appandcardFeignClient = appandcardFeignClient;
    }

    public Utilisateur sessionUser()
    {
        org.springframework.security.core.userdetails.User springUser =
                (org.springframework.security.core.userdetails.User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return appandcardFeignClient.findUserByEmail(springUser.getUsername()).getBody();
    }
}
