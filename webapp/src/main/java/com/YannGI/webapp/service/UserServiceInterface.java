package com.YannGI.webapp.service;
import com.YannGI.webapp.model.Utilisateur;
import org.springframework.stereotype.Service;

@Service
public interface UserServiceInterface
{
    // #####################################################
    // ################### SECURITY ########################
    // #####################################################

    public Utilisateur registration(Utilisateur utilisateur);

    public Utilisateur findByUserName(String email);
}
