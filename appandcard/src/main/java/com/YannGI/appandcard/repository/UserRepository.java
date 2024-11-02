package com.YannGI.appandcard.repository;

import com.YannGI.appandcard.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Utilisateur, Integer>
{
    public Optional<Utilisateur> findUserByEmail(String email);

    public Optional<Utilisateur> findUserByIdUser(int idUser);
}
