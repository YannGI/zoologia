package com.YannGI.webapp.controller;

import com.YannGI.webapp.model.Utilisateur;
import com.YannGI.webapp.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController
{
    private final UserServiceImpl userServiceImpl;

    public UserController(UserServiceImpl userServiceImpl)
    {
        this.userServiceImpl = userServiceImpl;
    }

    @GetMapping("/")
    public ModelAndView home(Model model)
    {
        return new ModelAndView("HomeZoologia");
    }

    @GetMapping("/HomeZoologia")
    public ModelAndView home()
    {
        return new ModelAndView("HomeZoologia");
    }

    @GetMapping("/signup")
    public ModelAndView showRegisterForm()
    {
        return new ModelAndView("signup", "signUpForm", new Utilisateur());
    }

    @PostMapping("/signup")
    public ModelAndView processRequest(@ModelAttribute("signUpForm") Utilisateur utilisateur)
    {
        userServiceImpl.registration(utilisateur);
        return new ModelAndView("signin");
    }
}

