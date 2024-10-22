package com.YannGI.webapp.controller;

import com.YannGI.webapp.model.Utilisateur;
import com.YannGI.webapp.service.CustomUserDetailsService;
import com.YannGI.webapp.service.UserServiceImpl;
import com.YannGI.webapp.service.client.UserFeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController
{
    private final UserServiceImpl userServiceImpl;
    private final UserFeignClient userFeignClient;
    private final CustomUserDetailsService userDetailsService;

    public UserController(UserServiceImpl userServiceImpl, UserFeignClient userFeignClient, CustomUserDetailsService userDetailsService)
    {
        this.userServiceImpl = userServiceImpl;
        this.userFeignClient = userFeignClient;
        this.userDetailsService = userDetailsService;
    }

    // #####################################################
    // ################### SECURITY ########################
    // #####################################################
    @GetMapping("/HomeZoologia") // page home
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
        return new ModelAndView("login");
    }

    // #####################################################
    // ####################### VUES ########################
    // #####################################################
    // -----------------------------------------------------
    // ################# VUE_MODIF_APP #####################
    @GetMapping("/ModifAppMenu") //vue ModifAppMenu
    public ModelAndView showModifAppMenu()
    {
        return new ModelAndView("ModifAppMenu");
    }

    // ################# VUE_COMPTE #####################
    @GetMapping("/DetailCompte") //vue DetailCompte
    public ModelAndView showDetailCompte()
    {
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
    // -----------------------------------------------------
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
        userFeignClient.createUser(utilisateur);
        return "redirect:/DeleteUser";
    }

    // ################### DELETE ##########################
    @GetMapping("/listUser")
    public ModelAndView listUser(Model model) // vue DeleteUser
    {
        model.addAttribute("utilisateurs", userFeignClient.getAllUsers().getBody());
        return new ModelAndView("DeleteUser");
    }

    @GetMapping("/DeleteUser/{idUser}") // crud
    public String deleteUser(@PathVariable("idUser")int idUser)
    {
        userFeignClient.deleteUser(idUser);
        return "redirect:/listUser";
    }

    // ################### UPDATE ##########################

}

