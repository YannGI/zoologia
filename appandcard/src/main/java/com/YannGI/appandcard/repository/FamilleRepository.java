package com.YannGI.appandcard.repository;

import com.YannGI.appandcard.model.Famille;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilleRepository extends JpaRepository<Famille, Integer>
{

}
