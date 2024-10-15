package com.YannGI.service;

import com.YannGI.model.Animal;
import com.YannGI.model.Utilisateur;
import com.YannGI.repository.AnimalRepository;
import org.springframework.stereotype.Service;

@Service
public class AnimalService
{
    private final AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository)
    {
        this.animalRepository = animalRepository;
    }

    // #####################################################
    // ################### CRUD animal #####################
    // #####################################################

    public Animal createAnimal(Animal animal)
    {
        return animalRepository.save(animal);
    }
}
