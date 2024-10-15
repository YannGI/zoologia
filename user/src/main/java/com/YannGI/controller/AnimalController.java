package com.YannGI.controller;

import com.YannGI.model.Animal;
import com.YannGI.model.Utilisateur;
import com.YannGI.service.AnimalService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController
{

    private final AnimalService animalService;

    public AnimalController(AnimalService animalService)
    {
        this.animalService = animalService;
    }

    // #####################################################
    // ################### CRUD animal #####################
    // #####################################################

    @PostMapping("createAnimal")
    public Animal createAnimal(@RequestBody Animal animal)
    {
        animalService.createAnimal(animal);
        return animal;
    }
}
