package com.example.springbatchexample.repository.source;

import com.example.springbatchexample.entity.source.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
}