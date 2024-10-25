package com.YannGI.controller;

import com.YannGI.model.Animal;
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

    // ################### HOME GET ########################
    @GetMapping("findAllAnimals")
    public List<Animal> findAllAnimals()
    {
        return animalService.findAllAnimals();
    }

    // ################### CREATE ##########################
    @PostMapping("createAnimal")
    public Animal createAnimal(@RequestBody Animal animal)
    {
        animalService.createAnimal(animal);
        return animal;
    }

    // ################### DELETE ##########################
    @GetMapping("getAllAnimals")
    public List<Animal> getAllAnimals()
    {
        return animalService.getAllAnimals();
    }

    @DeleteMapping("deleteAnimal")
    public void deleteAnimal(@RequestParam int idAnimal)
    {
        animalService.deleteAnimal(idAnimal);
    }

    // ################### UPDATE ##########################
}
