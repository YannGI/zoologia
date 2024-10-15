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

    public Animal createAnimal(Animal animal)
    {
        return animalRepository.save(animal);
    }

    public List<Animal> getAllAnimals()
    {
        return animalRepository.findAll();
    }

    public void deleteAnimal (Long id)
    {
        animalRepository.deleteById(Long.valueOf(id).intValue());
    }
}
