package com.YannGI.webapp.service.client;

import com.YannGI.webapp.model.Animal;
import com.YannGI.webapp.model.Utilisateur;
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
    @PostMapping(value = "/createAnimal", consumes = "application/json")
    public ResponseEntity<Animal> createAnimal(Animal animal);

    // #################### DELETE #########################
    @GetMapping(value = "/getAllAnimals",consumes = "application/json")
    public ResponseEntity<List<Animal>> getAllAnimals();

    @DeleteMapping(value = "/deleteAnimal",consumes = "application/json")
    public void deleteAnimal(@RequestParam Long id);

    // #################### UPDATE #########################
}
