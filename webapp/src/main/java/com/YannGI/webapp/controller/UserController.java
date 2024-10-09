package com.YannGI.webapp.controller;

import com.YannGI.webapp.model.Utilisateur;
import com.YannGI.webapp.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController
{
   /* @GetMapping("/")
    public ModelAndView home(Model model) {
        return new ModelAndView("HomeZoologia");
    }*/
   private final UserServiceImpl userServiceImpl;

    public UserController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
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

