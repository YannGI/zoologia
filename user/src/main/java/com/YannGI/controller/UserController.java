package com.YannGI.controller;

import com.YannGI.model.Utilisateur;
import com.YannGI.service.UserService;
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

    @PostMapping ("/findUserByEmail")
    public Utilisateur findUserByEmail (@RequestParam String email)
    {
        return userService.findUser(email);
    }

    @PostMapping ("saveUser")
    public Utilisateur saveUser (@RequestBody Utilisateur userSignUpForm)
    {
        userService.saveUser(userSignUpForm);
        return userSignUpForm;
    }

    // #####################################################
    // ############### CRUD utilisateur ####################
    // #####################################################

    @PostMapping("createUser")
    public Utilisateur createUser (@RequestBody Utilisateur utilisateur)
    {
        userService.createUser(utilisateur);
        return utilisateur;
    }

    @GetMapping("getAll")
    public List<Utilisateur> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @DeleteMapping("deleteUser")
    public void deleteUser(@RequestParam int idUser)
    {
        userService.deleteUser(idUser);
    }
}
