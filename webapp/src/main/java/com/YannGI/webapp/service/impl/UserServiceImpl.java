package com.YannGI.webapp.service.impl;

import com.YannGI.webapp.model.Utilisateur;
import com.YannGI.webapp.service.UserServiceInterface;
import com.YannGI.webapp.service.client.UtilisateurFeignClient;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServiceInterface
{
    final PasswordEncoder passwordEncoder;
    private final UtilisateurFeignClient utilisateurFeignClient;

    public UserServiceImpl(PasswordEncoder passwordEncoder, UtilisateurFeignClient utilisateurFeignClient) {
        this.passwordEncoder = passwordEncoder;
        this.utilisateurFeignClient = utilisateurFeignClient;
    }

    @Override
    public Utilisateur registration(Utilisateur utilisateur)
    {
        Utilisateur utilisateur1 = new Utilisateur();
        utilisateur1.setPassword(passwordEncoder.encode(utilisateur.getPassword()));
        utilisateur1.setEmail(utilisateur.getEmail());
        return utilisateurFeignClient.saveUser(utilisateur1);
    }
}
