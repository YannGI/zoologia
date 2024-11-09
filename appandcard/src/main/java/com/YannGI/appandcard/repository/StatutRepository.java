package com.YannGI.appandcard.repository;

import com.YannGI.appandcard.model.Statut;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatutRepository extends JpaRepository<Statut, Integer>
{

}
