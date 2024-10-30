package com.YannGI.webapp.service.client;

import com.YannGI.webapp.model.Animal;
import com.YannGI.webapp.model.Utilisateur;
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
 /*   @PostMapping(value = "/createFamille", consumes = "application/json")
    public Famille createFamille(@RequestParam String nomFamille); // famille

   @PostMapping(value = "/createFamille", consumes = "application/json")
    Famille createFamille(@RequestParam("nomFamille") String nomFamille);

    @PostMapping(value = "/createCategorie", consumes = "application/json")
    public Categorie createCategorie(String nomCategorie); // categorie

    @PostMapping(value = "/createStatut", consumes = "application/json")
    public Statut createStatut(String nomStatut); // statut

    @PostMapping(value = "/createPays", consumes = "application/json")
    public Pays createPays(String nomPays); // pays

    @PostMapping(value = "/createAnimal", consumes = "application/json")
    public ResponseEntity<Animal> createAnimal(Animal animal); // animalFormDTO*/

    // #################### DELETE #########################
    @GetMapping(value = "/getListPets",consumes = "application/json")
    public ResponseEntity<List<Animal>> getListAnimals();

    @DeleteMapping(value = "/deleteAnimal",consumes = "application/json")
    public void deleteAnimal(@RequestParam int idAnimal);

    // #################### UPDATE #########################
}
