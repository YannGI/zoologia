package com.YannGI.service;

import com.YannGI.model.Utilisateur;
import com.YannGI.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    // #####################################################
    // ################### SECURITY ########################
    // #####################################################

    public Utilisateur findUser(String email)
    {
        return userRepository.findUserByEmail(email).get();
    }

    public Utilisateur saveUser(Utilisateur userSignUpForm)
    {
        return userRepository.save(userSignUpForm);
    }

    // #####################################################
    // ############### CRUD utilisateur ####################
    // #####################################################

    public Utilisateur createUser(Utilisateur utilisateur)
    {
        return userRepository.save(utilisateur);
    }

    public List<Utilisateur> getAllUsers()
    {
        return userRepository.findAll();
    }

    public void deletePatient(Long id)
    {
        userRepository.deleteById(Long.valueOf(id).intValue());
    }
}
