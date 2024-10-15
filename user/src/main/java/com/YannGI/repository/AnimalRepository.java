package com.YannGI.repository;

import com.YannGI.model.Animal;
import com.YannGI.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer>
{

}
