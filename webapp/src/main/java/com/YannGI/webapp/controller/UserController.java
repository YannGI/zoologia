package com.YannGI.webapp.controller;

import com.YannGI.webapp.model.Utilisateur;
import com.YannGI.webapp.service.CustomUserDetailsService;
import com.YannGI.webapp.service.UserServiceImpl;
import com.YannGI.webapp.service.client.UserFeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
    // ############### CRUD utilisateur ####################
    // #####################################################

    // ################### CREATE ##########################
    @GetMapping("/createUser")  // vue
    public ModelAndView addUser(Model model)
    {
        model.addAttribute("utilisateur", new Utilisateur());
        return new ModelAndView("CreateUser");
    }

    @PostMapping("/createUser") // @PostMapping("/createUser/valid") // crud
    public String createUser(@ModelAttribute("utilisateur") Utilisateur utilisateur)
    {
        userFeignClient.createUser(utilisateur);
        return "redirect:/DeleteUser";
    }

    // ################### DELETE ##########################
    @GetMapping("/listUser")
    public ModelAndView listUser(Model model) // vue
    {
        model.addAttribute("utilisateurs", userFeignClient.getAllUsers().getBody());
        return new ModelAndView("DeleteUser");
    }

    @GetMapping("/deleteUser/{id}") // crud
    public String deleteUser(@PathVariable("id")Long id)
    {
        userFeignClient.deleteUser(id);
        return "redirect:/listUser";
    }

    // ################### UPDATE ##########################

}

