package com.YannGI.webapp.service.client;

import com.YannGI.webapp.model.Animal;
import com.YannGI.webapp.model.Utilisateur;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("animal")
public interface AnimalFeignClient
{
    // #####################################################
    // ################### CRUD animal #####################
    // #####################################################

    @PostMapping(value = "/createAnimal", consumes = "application/json")
    public ResponseEntity<Animal> createAnimal(Animal animal);
}
