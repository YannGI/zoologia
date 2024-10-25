package com.YannGI.webapp.service.client;

import com.YannGI.webapp.model.*;
import com.YannGI.webapp.model.DTO.AnimalFormDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("animal")
public interface AnimalFeignClient
{
    // #####################################################
    // ################### CRUD animal #####################
    // #####################################################

    // #################### GET HOME #######################
    @GetMapping(value = "/findAllAnimals",consumes = "application/json")
    public List<Animal> findAllAnimals();

    // #################### CREATE #########################
    @PostMapping(value = "/createFamille", consumes = "application/json")
    public Famille createFamille(@RequestParam String nomFamille); // famille

  /*  @PostMapping(value = "/createFamille", consumes = "application/json")
    Famille createFamille(@RequestParam("nomFamille") String nomFamille);*/

    @PostMapping(value = "/createCategorie", consumes = "application/json")
    public Categorie createCategorie(String nomCategorie); // categorie

    @PostMapping(value = "/createStatut", consumes = "application/json")
    public Statut createStatut(String nomStatut); // statut

    @PostMapping(value = "/createPays", consumes = "application/json")
    public Pays createPays(String nomPays); // pays

    @PostMapping(value = "/createAnimal", consumes = "application/json")
    public ResponseEntity<Animal> createAnimal(Animal animal); // animalFormDTO

    // #################### DELETE #########################
    @GetMapping(value = "/getAllAnimals",consumes = "application/json")
    public ResponseEntity<List<Animal>> getAllAnimals();

    @DeleteMapping(value = "/deleteAnimal",consumes = "application/json")
    public void deleteAnimal(@RequestParam int idAnimal);

    // #################### UPDATE #########################
}
