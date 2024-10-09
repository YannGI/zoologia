package com.YannGI.webapp.service;

import com.YannGI.webapp.model.Utilisateur;
import com.YannGI.webapp.service.client.UtilisateurFeignClient;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AuthentificationService implements UserDetailsService
{
    private final UtilisateurFeignClient utilisateurFeignClient;

    public AuthentificationService(UtilisateurFeignClient utilisateurFeignClient) {
        this.utilisateurFeignClient = utilisateurFeignClient;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException
    {
        Optional<Utilisateur> user = utilisateurFeignClient.findUserByEmail(s);

        if (user.isPresent())
        {
            return new org.springframework.security.core.userdetails.User(user.get().getEmail(), user.get().getPassword(), new ArrayList<>());
        }
        throw new UsernameNotFoundException(s);
    }
}
