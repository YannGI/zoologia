package com.YannGI.appandcard.controller;

import com.YannGI.appandcard.model.Animal;
import com.YannGI.appandcard.model.Famille;
import com.YannGI.appandcard.service.AnimalService;
import org.springframework.http.ResponseEntity;
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
    @GetMapping("/findAllAnimals")
    public ResponseEntity<List<Animal>> findAllAnimals()
    {
        List<Animal> allAnimals = animalService.findAllAnimals();
        return ResponseEntity.ok(allAnimals);
    }

    // ############### GET ANIMAL DETAIL ###################
    @GetMapping("/findAnimalByIdAnimal")
    public Animal findAnimalByIdAnimal(@RequestParam int idAnimal)
    {
        return animalService.findAnimalByIdAnimal(idAnimal);
    }

    // ################### CREATE ##########################
    /*@PostMapping(value = "/createFamille", consumes = "application/json")
    public Famille createFamille(@RequestParam String nomFamille)
    {
        Famille famille = new Famille();
        *//*famille.setNomFamille(nomFamille);*//*
        animalService.createFamille(nomFamille);
        return famille;
    }*/

    /*@PostMapping("createAnimal")
    public Animal createAnimal(@RequestBody Animal animal)
    {
        animalService.createAnimal(animal);
        return animal;
    }*/

    // ################### DELETE ##########################
    @GetMapping("/getListPets")
    public List<Animal> getListPets()
    {
        return animalService.getListPets();
    }

    @DeleteMapping("/deleteAnimal")
    public void deleteAnimal(@RequestParam int idAnimal)
    {
        animalService.deleteAnimal(idAnimal);
    }

    // ############### UPDATE ####################
    @GetMapping("/getAnimalByIdAnimal")
    public Animal getAnimalByIdAnimal(@RequestParam int idAnimal)
    {
        return animalService.getAnimalByIdAnimal(idAnimal);
    }

   /* @PostMapping("/updateAnimal")
    public AnimalDTO updateAnimal(@RequestBody AnimalDTO animalDTO)
    {
        animalService.updateAnimal(animalDTO);
        return animalDTO;
    }*/
}
