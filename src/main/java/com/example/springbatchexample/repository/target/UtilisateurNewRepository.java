package com.example.springbatchexample.repository.target;

import com.example.springbatchexample.entity.target.UtilisateurNew;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UtilisateurNewRepository extends JpaRepository<UtilisateurNew, UUID> {
}