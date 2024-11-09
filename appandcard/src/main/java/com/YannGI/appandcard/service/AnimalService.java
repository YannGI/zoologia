package com.YannGI.appandcard.service;

import com.YannGI.appandcard.model.Animal;
import com.YannGI.appandcard.repository.AnimalRepository;
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

    // ################### HOME GET ########################
    public List<Animal> findAllAnimals()
    {
        return animalRepository.findAll();
    }

    // ############### GET ANIMAL DETAIL ####################
    public Animal findAnimalByIdAnimal(int idAnimal)
    {
        return animalRepository.findAnimalByIdAnimal(idAnimal).get();
    }

    // ################### CREATE ##########################
    public Animal createAnimal(Animal animal)
    {
        return animalRepository.save(animal);
    }

    // ################### DELETE ##########################
    public List<Animal> getListPets()
    {
        return animalRepository.findAll();
    }

    public void deleteAnimal (int idAnimal)
    {
        animalRepository.deleteById(idAnimal);
    }

    // ############### UPDATE ####################
    public Animal getAnimalByIdAnimal(int idAnimal)
    {
        return animalRepository.findAnimalByIdAnimal(idAnimal).get();
    }

    /*public Animal updateAnimal(Animal animal)
    {
        return animalRepository.save(animal);
    }*/
}
