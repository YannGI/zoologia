package com.YannGI.webapp.controller;

import com.YannGI.webapp.model.*;
import com.YannGI.webapp.model.DTO.AnimalDTO;
import com.YannGI.webapp.service.client.AppandcardFeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AnimalController
{
    private final AppandcardFeignClient appandcardFeignClient;

    public AnimalController(AppandcardFeignClient appandcardFeignClient)
    {
        this.appandcardFeignClient = appandcardFeignClient;
    }

    // #####################################################
    // ################### CRUD animal #####################
    // #####################################################

    // #####################################################
    // ###################### VUES #########################
    // #####################################################

    // ################### GET HOME ########################
    @GetMapping("/HomeZoologia") // page home
    public ModelAndView getAnimals(Model model)
    {
        List<Animal> animals = appandcardFeignClient.retrieveAllAnimals().getBody();
        model.addAttribute("animals", animals);
        return new ModelAndView("HomeZoologia");
    }

    // ############## GET ANIMAL DETAIL ####################
    @GetMapping("/getAnimalDetailCard/{idAnimal}") // page animal_detail
    public ModelAndView getAnimalDetailInfo(@PathVariable("idAnimal")int idAnimal, Model model)
    {
        model.addAttribute("animal", appandcardFeignClient.getAnimalDetail(idAnimal));
        return new ModelAndView("carddescription/Animaldetail");
    }

    // ################### CREATE ##########################
    @GetMapping("/CreateCard") // vue
    public ModelAndView addAnimal(Model model)
    {
        model.addAttribute("animalFormDTO", new AnimalDTO());
        return new ModelAndView("CreateCard");
    }

    @PostMapping("/CreateAnimal") // crud
    public String createAnimal(@ModelAttribute("animalFormDTO") AnimalDTO animalDTO)
    {
        String nomFamille = animalDTO.getNomCategorie();
        Famille famille = appandcardFeignClient.createFamille(nomFamille); // categorie

        String nomCategorie = animalDTO.getNomCategorie();
        Categorie categorie = appandcardFeignClient.createCategorie(nomCategorie); // categorie

        String nomStatut = animalDTO.getNomStatut();
        Statut statut = appandcardFeignClient.createStatut(nomStatut); // statut

        /*String nomPays = animalDTO.getNomPays();
        Pays pays = appandcardFeignClient.createPays(nomPays); // pays*/

        // Création de l'objet Animal et affectation des valeurs
        Animal animal = new Animal();
        animal.setIdFamille(famille);
        animal.setIdCategorie(categorie);
        animal.setIdStatut(statut);
        animal.setNom(animalDTO.getNom());
        animal.setTaille(animalDTO.getTaille());
        animal.setRegimAlim(animalDTO.getRegimAlim());
        animal.setDescription(animalDTO.getDescription());
        animal.setPoids(animalDTO.getPoids());
        // animal.setPpimage(animalDTO.getPpimage()); // Assurez-vous de cette ligne si vous avez l'image

        // Envoi de l'objet Animal via FeignClient
        appandcardFeignClient.createAnimal(animal);

        return "redirect:/listAnimal";
    }


    // ################### DELETE ##########################
    @GetMapping("/listAnimal")
    public ModelAndView listAnimal(Model model) // vue
    {
        model.addAttribute("animals", appandcardFeignClient.getListAnimals().getBody());
        return new ModelAndView("DeleteCard");
    }

    @GetMapping("/deleteCardAnimal/{idAnimal}") // crud
    public String deleteAnimal(@PathVariable("idAnimal")int idAnimal)
    {
        appandcardFeignClient.deleteAnimal(idAnimal);
        return "redirect:/listAnimal";
    }

    // ################### UPDATE ##########################

    @GetMapping("/UpdateAnimal/{idAnimal}") // vue
    public String showUpdateUserForm(@PathVariable("idAnimal") int idAnimal, Model model)
    {
        Animal animal = appandcardFeignClient.findAnimalByIdAnimal(idAnimal);
        model.addAttribute("animal", animal);
        return "UpdateAnimal/UpdateAnimal";
    }

   /* @PostMapping("/UpdateAnimal/valid") // crud
    public String updateAnimal(@ModelAttribute("animalFormDTO") AnimalDTO animalDTO)
    {
        appandcardFeignClient.updateAnimal(animalDTO);
        return "redirect:/listAnimal";
    }*/
}
