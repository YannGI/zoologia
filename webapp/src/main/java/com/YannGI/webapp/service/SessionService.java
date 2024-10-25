package com.YannGI.webapp.service;

import com.YannGI.webapp.model.Utilisateur;
import com.YannGI.webapp.service.client.UserFeignClient;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class SessionService
{
    private final UserFeignClient userFeignClient;

    public SessionService(UserFeignClient userFeignClient) {
        this.userFeignClient = userFeignClient;
    }


    public Utilisateur sessionUser()
    {
        org.springframework.security.core.userdetails.User springUser =
                (org.springframework.security.core.userdetails.User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return userFeignClient.findUserByEmail(springUser.getUsername()).getBody();
    }
}
