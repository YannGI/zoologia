package com.YannGI.webapp.controller;

import com.YannGI.webapp.model.Utilisateur;
import com.YannGI.webapp.service.SessionService;
import com.YannGI.webapp.service.UserServiceImpl;
import com.YannGI.webapp.service.client.AppandcardFeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class UserController
{
    private final UserServiceImpl userServiceImpl;
    private final AppandcardFeignClient appandcardFeignClient;
    private final SessionService sessionService;

    public UserController(UserServiceImpl userServiceImpl, AppandcardFeignClient appandcardFeignClient, SessionService sessionService)
    {
        this.userServiceImpl = userServiceImpl;
        this.appandcardFeignClient = appandcardFeignClient;
        this.sessionService = sessionService;
    }


    // #####################################################
    // ################### SECURITY ########################
    // #####################################################
    @GetMapping("/signup")
    public ModelAndView showRegisterForm()
    {
        return new ModelAndView("signup", "userSignUpForm", new Utilisateur());
    }

    @PostMapping("/signup")
    public ModelAndView userSignUp(@ModelAttribute("userSignUpForm") Utilisateur userSignUpForm)
    {
        userServiceImpl.registration(userSignUpForm);
        return new ModelAndView("login");
    }

    // #####################################################
    // ####################### VUES ########################
    // #####################################################

    // ################# VUE_MODIF_APP #####################
    @GetMapping("/ModifAppMenu") //vue ModifAppMenu
    public ModelAndView showModifAppMenu()
    {
        return new ModelAndView("ModifAppMenu");
    }

    // ################# VUE_COMPTE #####################
    @GetMapping("/DetailCompte") // vue
    public ModelAndView getInfoCompteUser(Model model)
    {
        model.addAttribute("utilisateur", sessionService.sessionUser());
        return new ModelAndView("DetailCompte");
    }

    // ################# VUE_FAVORIS #####################
    @GetMapping("/Favoris") //vue Favoris
    public ModelAndView showFavoris()
    {
        return new ModelAndView("Favoris");
    }

    // #####################################################
    // ############### CRUD utilisateur ####################
    // #####################################################

    // ################### CREATE ##########################
    @GetMapping("/CreateUser") // vue CreateUser
    public ModelAndView addUser(Model model)
    {
        model.addAttribute("utilisateur", new Utilisateur());
        return new ModelAndView("CreateUser");
    }

    @PostMapping("/CreateUser/valid") // crud
    public String CreateUser(@ModelAttribute("utilisateur") Utilisateur utilisateur)
    {
        appandcardFeignClient.createUser(utilisateur);
        return "redirect:/listUser";
    }

    // ################### DELETE ##########################
    @GetMapping("/listUser")
    public ModelAndView listUser(Model model) // vue DeleteUser
    {
        model.addAttribute("utilisateurs", appandcardFeignClient.getAllUsers().getBody());
        return new ModelAndView("DeleteUser");
    }

    @GetMapping("/DeleteUser/{idUser}") // crud
    public String deleteUser(@PathVariable("idUser")int idUser)
    {
        appandcardFeignClient.deleteUser(idUser);
        return "redirect:/listUser";
    }

    // ################### UPDATE ##########################
}
