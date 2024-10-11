package com.YannGI.controller;

import com.YannGI.model.Utilisateur;
import com.YannGI.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
    private final UserService userService;

    public UserController(UserService userService)
    {
        this.userService = userService;
    }

    @PostMapping ("/findUserByEmail")
    public Utilisateur findUser (@RequestParam String email)
    {
        return userService.findUser(email);
    }

    @PostMapping ("saveUser")
    public Utilisateur saveUser (@RequestBody Utilisateur userSignUpForm)
    {
        userService.saveUser(userSignUpForm);
        return userSignUpForm;
    }
}
