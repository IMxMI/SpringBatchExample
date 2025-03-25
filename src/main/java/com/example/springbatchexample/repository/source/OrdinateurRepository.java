package com.example.springbatchexample.repository.source;

import com.example.springbatchexample.entity.source.Ordinateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdinateurRepository extends JpaRepository<Ordinateur, Integer> {
}