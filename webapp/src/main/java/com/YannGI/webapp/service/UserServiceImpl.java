package com.YannGI.webapp.service;

import com.YannGI.webapp.model.Utilisateur;
import com.YannGI.webapp.service.client.UserFeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServiceInterface
{
    private final PasswordEncoder passwordEncoder;
    private final UserFeignClient userFeignClient;

    public UserServiceImpl(PasswordEncoder passwordEncoder, UserFeignClient userFeignClient)
    {
        this.passwordEncoder = passwordEncoder;
        this.userFeignClient = userFeignClient;
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
        return userFeignClient.saveUser(utilisateur).getBody();
    }

    @Override
    public Utilisateur findByUserName(String email)
    {
        ResponseEntity<Utilisateur> userByEmail = userFeignClient.findUserByEmail(email);
        Utilisateur body = userByEmail.getBody();
        return body;
    }
}
