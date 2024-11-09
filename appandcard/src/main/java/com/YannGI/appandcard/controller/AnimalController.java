package com.YannGI.appandcard.controller;

import com.YannGI.appandcard.model.*;
import com.YannGI.appandcard.service.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnimalController
{
    private final AnimalService animalService;
    private final CategorieService categorieService;
    private final FamilleService familleService;
    private final StatutService statutService;
    private final PaysService paysService;

    public AnimalController(AnimalService animalService, CategorieService categorieService, FamilleService familleService, StatutService statutService, PaysService paysService)
    {
        this.animalService = animalService;
        this.categorieService = categorieService;
        this.familleService = familleService;
        this.statutService = statutService;
        this.paysService = paysService;
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
    @PostMapping(value = "/createFamille", consumes = "application/json")
    public Famille createFamille(@RequestParam String nomFamille)
    {

        return familleService.createFamille(nomFamille);
    }

    @PostMapping(value = "/createCategorie", consumes = "application/json")
    public Categorie createCategorie(@RequestParam String nomCategorie)
    {
       return categorieService.createCategorie(nomCategorie);
    }

    @PostMapping(value = "/createStatut", consumes = "application/json")
    public Statut createStatut(@RequestParam String nomStatut)
    {
        return statutService.createStatut(nomStatut);
    }

    @PostMapping(value = "/createPays", consumes = "application/json")
    public Pays createPays(@RequestParam String nomPays)
    {
        return paysService.createPays(nomPays);
    }

    @PostMapping("/createAnimal")
    public Animal createAnimal(@RequestBody Animal animal)
    {
        return animalService.createAnimal(animal);
    }

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
