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
        return new ModelAndView("redirect:/HomeZoologia");
    }

    @GetMapping("/HomeZoologia")
    public ModelAndView home()
    {
        return new ModelAndView("HomeZoologia");
    }

    @GetMapping("/signup")
    public ModelAndView showRegisterForm()
    {
        return new ModelAndView("signup", "userSignUpForm", new Utilisateur());
    }

    @PostMapping("/signup")
    public ModelAndView userSignUp(@ModelAttribute("userSignUpForm") Utilisateur userSignUpForm)
    {
        userServiceImpl.registration(userSignUpForm);
        return new ModelAndView("signin");
    }
}

