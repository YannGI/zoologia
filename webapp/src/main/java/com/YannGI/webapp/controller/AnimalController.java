package com.YannGI.webapp.controller;

import com.YannGI.webapp.model.*;
import com.YannGI.webapp.model.DTO.AnimalFormDTO;
import com.YannGI.webapp.service.client.AnimalFeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AnimalController
{
    private final AnimalFeignClient animalFeignClient;

    public AnimalController(AnimalFeignClient animalFeignClient)
    {
        this.animalFeignClient = animalFeignClient;
    }

    // #####################################################
    // ################### CRUD animal #####################
    // #####################################################

    // ################### HOME GET #########################
    @GetMapping("/animals") // vue
    public String getAnimals(Model model)
    {
        List<Animal> animals = animalFeignClient.findAllAnimals();
        model.addAttribute("animals", animals);
        return "animals";
    }

    // ################### CREATE ##########################
    @GetMapping("/CreateCard") // vue
    public ModelAndView addAnimal(Model model)
    {
        model.addAttribute("animalFormDTO", new AnimalFormDTO());
        return new ModelAndView("CreateCard");
    }

  /*  @PostMapping("/CreateAnimal") // crud
    public String createAnimal(@ModelAttribute("animalFormDTO") AnimalFormDTO animalFormDTO) {
        // Récupération des données du formulaire
        *//*Famille famille = new Famille();
        String nomFamille = animalFormDTO.getNonFamille();
        famille.setNomFamille(nomFamille);*//*

        String nomFamille = animalFormDTO.getNomCategorie();
        Famille famille = animalFeignClient.createFamille(nomFamille); // famille

        String nomCategorie = animalFormDTO.getNomCategorie();
        Categorie categorie = animalFeignClient.createCategorie(nomCategorie); // categorie

        String nomStatut = animalFormDTO.getNomStatut();
        Statut statut = animalFeignClient.createStatut(nomStatut); // statut

        String nomPays = animalFormDTO.getNomPays();
        Pays pays = animalFeignClient.createPays(nomPays); // pays

        // Création de l'objet Animal et affectation des valeurs
        Animal animal = new Animal();
        animal.setIdFamille(famille);
        animal.setIdCategorie(categorie);
        animal.setIdStatut(statut);
        animal.setNom(animalFormDTO.getNom());
        animal.setTaille(animalFormDTO.getTaille());
        animal.setRegimAlim(animalFormDTO.getRegimAlim());
        animal.setDescription(animalFormDTO.getDescription());
        animal.setPoids(animalFormDTO.getPoids());
        // animal.setPpimage(animalFormDTO.getPpimage()); // Assurez-vous de cette ligne si vous avez l'image

        // Envoi de l'objet Animal via FeignClient
        animalFeignClient.createAnimal(animal);

        return "redirect:/listAnimal";
    }*/

    // ################### DELETE ##########################
    @GetMapping("/listAnimal")
    public ModelAndView listAnimal(Model model) // vue
    {
        model.addAttribute("animals", animalFeignClient.getAllAnimals().getBody());
        return new ModelAndView("DeleteCard");
    }

    @GetMapping("/deleteAnimal/{idAnimal}") // crud
    public String deleteAnimal(@PathVariable("idAnimal")int idAnimal)
    {
        animalFeignClient.deleteAnimal(idAnimal);
        return "redirect:/listAnimal";
    }

    // ################### UPDATE ##########################
}
