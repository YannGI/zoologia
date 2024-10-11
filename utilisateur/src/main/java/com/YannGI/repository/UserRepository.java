package com.YannGI.repository;

import com.YannGI.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Utilisateur, Integer>
{
    public Optional<Utilisateur> findUserByEmail(String email);
}
