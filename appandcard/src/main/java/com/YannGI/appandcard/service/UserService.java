package com.YannGI.appandcard.service;

import com.YannGI.appandcard.model.Utilisateur;
import com.YannGI.appandcard.repository.UserRepository;
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

    // ############### CREATE ####################
    public Utilisateur createUser(Utilisateur utilisateur)
    {
        return userRepository.save(utilisateur);
    }

    // ############### DELETE ####################
    public List<Utilisateur> getAllUsers()
    {
        return userRepository.findAll();
    }

    public void deleteUser(int idUser)
    {
        userRepository.deleteById(idUser);
    }

    // ############### UPDATE ####################
}