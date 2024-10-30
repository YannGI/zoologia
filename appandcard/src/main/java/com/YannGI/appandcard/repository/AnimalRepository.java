package com.YannGI.appandcard.repository;

import com.YannGI.appandcard.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface AnimalRepository  extends JpaRepository<Animal, Integer>
{
    List<Animal> findAll();

    public Optional<Animal> findAnimalByIdAnimal(int idAnimal);
}
