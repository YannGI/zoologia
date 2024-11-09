package com.YannGI.appandcard.repository;

import com.YannGI.appandcard.model.Pays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaysRepository extends JpaRepository<Pays, Integer>
{

}
