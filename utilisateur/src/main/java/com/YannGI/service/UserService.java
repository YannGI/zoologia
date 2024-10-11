package com.YannGI.service;

import com.YannGI.model.Utilisateur;
import com.YannGI.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public Utilisateur findUser(String email)
    {
        return userRepository.findUserByEmail(email).get();
    }

    public Utilisateur saveUser(Utilisateur utilisateur)
    {
        return userRepository.save(utilisateur);
    }
}
