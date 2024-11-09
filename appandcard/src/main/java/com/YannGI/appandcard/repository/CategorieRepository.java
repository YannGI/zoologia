package com.YannGI.appandcard.repository;

import com.YannGI.appandcard.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Integer>
{

}
