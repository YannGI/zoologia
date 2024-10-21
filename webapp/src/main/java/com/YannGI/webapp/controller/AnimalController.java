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

import java.util.List;

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

    // ################### HOME GET #########################
    @GetMapping("/animals")
    public String getAnimals(Model model)
    {
        List<Animal> animals = animalFeignClient.findAllAnimals();
        model.addAttribute("animals", animals);
        return "animals";
    }

    // ################### CREATE ##########################
    @GetMapping("/createAnimal")  // vue
    public ModelAndView addAnimal(Model model)
    {
        model.addAttribute("animal", new Animal());
        return new ModelAndView("CreateAnimal");
    }

    @PostMapping("/createAnimal")  // crud
    public String createAnimal(@ModelAttribute("animal") Animal animal)
    {
        animalFeignClient.createAnimal(animal);
        return "redirect:/DeleteCard";
    }

    // ################### DELETE ##########################
    @GetMapping("/listAnimal")
    public ModelAndView listAnimal(Model model) // vue
    {
        model.addAttribute("animals", animalFeignClient.getAllAnimals().getBody());
        return new ModelAndView("DeleteCard");
    }

    @GetMapping("/deleteAnimal/{id}") // crud
    public String deleteAnimal(@PathVariable("id")Long id)
    {
        animalFeignClient.deleteAnimal(id);
        return "redirect:/listAnimal";
    }

    // ################### UPDATE ##########################
}
