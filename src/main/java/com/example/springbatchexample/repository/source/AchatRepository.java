package com.example.springbatchexample.repository.source;

import com.example.springbatchexample.entity.source.Achat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AchatRepository extends JpaRepository<Achat, Integer> {
}