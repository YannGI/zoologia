package com.YannGI.service;

import com.YannGI.model.Animal;
import com.YannGI.model.Utilisateur;
import com.YannGI.repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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

    // ################### HOME GET #########################
    public List<Animal> findAllAnimals()
    {
        return animalRepository.findAll();
    }

    // ################### CREATE ##########################
    public Animal createAnimal(Animal animal)
    {
        return animalRepository.save(animal);
    }

    // ################### DELETE ##########################
    public List<Animal> getAllAnimals()
    {
        return animalRepository.findAll();
    }

    public void deleteAnimal (Long id)
    {
        animalRepository.deleteById(Long.valueOf(id).intValue());
    }

    // ################### UPDATE ##########################
}
