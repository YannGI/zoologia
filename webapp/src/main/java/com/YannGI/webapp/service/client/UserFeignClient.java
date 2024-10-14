package com.YannGI.webapp.service.client;

import com.YannGI.webapp.model.Utilisateur;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("user")
public interface UserFeignClient
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

    @PostMapping (value = "/createUtilisateur", consumes = "application/json")
    public ResponseEntity<Utilisateur> createUser(Utilisateur utilisateur);

    @GetMapping(value = "/getAll",consumes = "application/json")
    public ResponseEntity<List<Utilisateur>> getAllPatients();

    @DeleteMapping(value = "/deleteUser",consumes = "application/json")
    public void deleteUser(@RequestParam Long id);
}
