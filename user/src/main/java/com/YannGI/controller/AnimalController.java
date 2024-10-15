package com.YannGI.controller;

import com.YannGI.model.Animal;
import com.YannGI.model.Utilisateur;
import com.YannGI.service.AnimalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("getAll")
    public List<Animal> getAllUsers()
    {
        return animalService.getAllAnimals();
    }

    @DeleteMapping("deleteAnimal")
    public void deleteAnimal(@RequestParam Long id)
    {
        animalService.deleteAnimal(id);
    }
}
