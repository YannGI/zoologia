package com.YannGI.appandcard.controller;

import com.YannGI.appandcard.model.Animal;
import com.YannGI.appandcard.model.Utilisateur;
import com.YannGI.appandcard.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController
{
    private final UserService userService;

    public UserController(UserService userService)
    {
        this.userService = userService;
    }

    // #####################################################
    // ################### SECURITY ########################
    // #####################################################
    @PostMapping("/findUserByEmail")
    public Utilisateur findUserByEmail (@RequestParam String email)
    {
        return userService.findUser(email);
    }

    @PostMapping ("/saveUser")
    public Utilisateur saveUser (@RequestBody Utilisateur userSignUpForm)
    {
        userService.saveUser(userSignUpForm);
        return userSignUpForm;
    }

    // #####################################################
    // ############### CRUD utilisateur ####################
    // #####################################################

    // ############### CREATE ####################
    @PostMapping("/createUser")
    public Utilisateur createUser (@RequestBody Utilisateur utilisateur)
    {
        userService.createUser(utilisateur);
        return utilisateur;
    }

    // ############### DELETE ####################
    @GetMapping("/getAll")
    public List<Utilisateur> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @DeleteMapping("/deleteUser")
    public void deleteUser(@RequestParam int idUser)
    {
        userService.deleteUser(idUser);
    }

    // ############### UPDATE ####################
    @GetMapping("/findUserByIdUser")
    public Utilisateur findUserByIdUser (@RequestParam int idUser)
    {
        return userService.findUserByIdUser(idUser);
    }

    @PostMapping("/updateUser")
    public Utilisateur updateUser (@RequestBody Utilisateur utilisateur)
    {
        userService.updateUser(utilisateur);
        return utilisateur;
    }
}
