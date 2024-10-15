package com.YannGI.webapp.controller;

import com.YannGI.webapp.model.Animal;
import com.YannGI.webapp.model.Utilisateur;
import com.YannGI.webapp.service.client.AnimalFeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AnimalController
{
    private final AnimalFeignClient animalFeignClient;

    public AnimalController(AnimalFeignClient animalFeignClient)
    {
        this.animalFeignClient = animalFeignClient;
    }

    // #####################################################
    // ################### CRUD animal #####################
    // #####################################################

    // ################### CREATE ##########################
    @GetMapping("/createAnimal")  // vue
    public ModelAndView addUser(Model model)
    {
        model.addAttribute("animal", new Animal());
        return new ModelAndView("CreateAnimal");
    }

    @PostMapping("/createAnimal")  // crud
    public String createAnimal(@ModelAttribute("animal") Animal animal)
    {
        animalFeignClient.createAnimal(animal);
        return "redirect:/DeleteAnimal";
    }

    // ################### DELETE ##########################
   /* @GetMapping("/listUser")
    public ModelAndView listUser(Model model) // vue
    {
        model.addAttribute("utilisateurs", createAnimal().getAllPatients().getBody());
        return new ModelAndView("DeleteUser");
    }

    @GetMapping("/deleteUser/{id}") // crud
    public String deleteUser(@PathVariable("id")Long id)
    {
        userFeignClient.deleteUser(id);
        return "redirect:/listUser";
    }*/

    // ################### UPDATE ##########################
}
