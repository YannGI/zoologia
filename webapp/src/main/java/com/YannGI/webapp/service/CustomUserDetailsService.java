package com.YannGI.webapp.service;

import com.YannGI.webapp.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserServiceImpl userService;

    // ######################################################
    // ####### AuthentificationService ## SECURITY ##########
    // ######################################################
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Utilisateur utilisateur = userService.findByUserName(email);
        if (utilisateur == null) {
            return null;
        }
        return User
                .withUsername(utilisateur.getEmail())
                .password(utilisateur.getPassword())

                .build();
    }
}