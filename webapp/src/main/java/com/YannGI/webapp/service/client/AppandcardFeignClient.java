package com.YannGI.webapp.service.client;

import com.YannGI.webapp.model.*;
import com.YannGI.webapp.model.DTO.AnimalDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("appandcard")
public interface AppandcardFeignClient
{
    // #####################################################
    // ################### SECURITY ########################
    // #####################################################
    @PostMapping( value = "/saveUser", consumes = "application/json")
    public ResponseEntity<Utilisateur> saveUser (@RequestBody Utilisateur userSignUpForm);

    @PostMapping( value = "/findUserByEmail", consumes = "application/json")
    public ResponseEntity<Utilisateur> findUserByEmail (@RequestParam String email);

    // #####################################################
    // ############### CRUD utilisateur ####################
    // #####################################################

    // #################### CREATE #########################
    @PostMapping (value = "/createUser", consumes = "application/json")
    public ResponseEntity<Utilisateur> createUser (@RequestBody Utilisateur utilisateur);

    // #################### DELETE #########################
    @GetMapping(value = "/getAll",consumes = "application/json")
    public ResponseEntity<List<Utilisateur>> getAllUsers();

    @DeleteMapping(value = "/deleteUser",consumes = "application/json")
    public void deleteUser(@RequestParam int idUser);

    // #################### UPDATE #########################
    @GetMapping(value = "/findUserByIdUser",consumes = "application/json")
    public Utilisateur findUserByIdUser(@RequestParam int idUser);

    @PostMapping (value = "/updateUser", consumes = "application/json")
    public ResponseEntity<Utilisateur> updateUser (@RequestBody Utilisateur utilisateur);

    // #####################################################
    // ################### CRUD animal #####################
    // #####################################################

    // #################### GET HOME #######################
    @GetMapping(value = "/findAllAnimals",consumes = "application/json")
    public ResponseEntity<List<Animal>> retrieveAllAnimals();

    // ################ GET ANIMAL DETAIL ###################
    @GetMapping(value = "/findAnimalByIdAnimal",consumes = "application/json")
    public Object getAnimalDetail(@RequestParam int idAnimal);

    // #################### CREATE #########################
    @PostMapping(value = "/createFamille", consumes = "application/json")
    public Famille createFamille(@RequestParam String nomFamille); // famille

    @PostMapping(value = "/createCategorie", consumes = "application/json")
    public Categorie createCategorie(@RequestParam String nomCategorie); // categorie

    @PostMapping(value = "/createStatut", consumes = "application/json")
    public Statut createStatut(@RequestParam String nomStatut); // statut

    @PostMapping(value = "/createPays", consumes = "application/json")
    public Pays createPays(@RequestParam String nomPays); // pays

    @PostMapping(value = "/createAnimal", consumes = "application/json")
    public ResponseEntity<Animal> createAnimal(@RequestBody Animal animal); // animalFormDTO

    // #################### DELETE #########################
    @GetMapping(value = "/getListPets",consumes = "application/json")
    public ResponseEntity<List<Animal>> getListAnimals();

    @DeleteMapping(value = "/deleteAnimal",consumes = "application/json")
    public void deleteAnimal(@RequestParam int idAnimal);


    // #################### UPDATE #########################
    @GetMapping(value = "/getAnimalByIdAnimal",consumes = "application/json")
    public Animal findAnimalByIdAnimal(@RequestParam int idAnimal);

   /* @PostMapping (value = "/updateAnimal", consumes = "application/json")
    public ResponseEntity<AnimalDTO> updateAnimal (@RequestBody AnimalDTO animalDTO);*/
}
