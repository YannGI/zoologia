package com.YannGI.webapp.service;

import com.YannGI.webapp.model.Utilisateur;
import com.YannGI.webapp.service.client.UtilisateurFeignClient;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServiceInterface
{
    private final PasswordEncoder passwordEncoder;
    private final UtilisateurFeignClient utilisateurFeignClient;

    public UserServiceImpl(PasswordEncoder passwordEncoder, UtilisateurFeignClient utilisateurFeignClient)
    {
        this.passwordEncoder = passwordEncoder;
        this.utilisateurFeignClient = utilisateurFeignClient;
    }

    @Override
    public Utilisateur registration(Utilisateur utilisateur)
    {
        Utilisateur utilisateur1 = new Utilisateur();
        utilisateur1.setFirstname(utilisateur.getFirstname());
        utilisateur1.setLastname(utilisateur.getLastname());
        utilisateur1.setUsername(utilisateur.getUsername());
        utilisateur1.setEmail(utilisateur.getEmail());
        utilisateur1.setPassword(passwordEncoder.encode(utilisateur.getPassword()));
        return utilisateurFeignClient.saveUser(utilisateur1).getBody();
    }

    @Override
    public Utilisateur findByUserName(String email)
    {
        return utilisateurFeignClient.findUserByEmail(email).getBody();
    }
}
