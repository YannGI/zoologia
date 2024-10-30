package com.YannGI.webapp.service;

import com.YannGI.webapp.model.Utilisateur;
import com.YannGI.webapp.service.client.AppandcardFeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServiceInterface
{
    private final PasswordEncoder passwordEncoder;
    private final AppandcardFeignClient appandcardFeignClient;

    public UserServiceImpl(PasswordEncoder passwordEncoder, AppandcardFeignClient appandcardFeignClient) {
        this.passwordEncoder = passwordEncoder;
        this.appandcardFeignClient = appandcardFeignClient;
    }

    // #####################################################
    // ################### SECURITY ########################
    // #####################################################
    @Override
    public Utilisateur registration(Utilisateur utilisateur)
    {
        Utilisateur user = new Utilisateur();
        utilisateur.setFirstname(utilisateur.getFirstname());
        utilisateur.setLastname(utilisateur.getLastname());
        utilisateur.setUsername(utilisateur.getUsername());
        utilisateur.setEmail(utilisateur.getEmail());
        utilisateur.setPassword(passwordEncoder.encode(utilisateur.getPassword()));
        return appandcardFeignClient.saveUser(utilisateur).getBody();
    }

    @Override
    public Utilisateur findByUserName(String email)
    {
        ResponseEntity<Utilisateur> userByEmail = appandcardFeignClient.findUserByEmail(email);
        Utilisateur body = userByEmail.getBody();
        return body;
    }
}
