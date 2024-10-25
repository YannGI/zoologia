package com.YannGI.repository;

import com.YannGI.model.Famille;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilleRepository extends JpaRepository<Famille, Integer >
{

}
