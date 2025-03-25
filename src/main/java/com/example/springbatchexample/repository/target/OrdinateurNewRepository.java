package com.example.springbatchexample.repository.target;

import com.example.springbatchexample.entity.target.OrdinateurNew;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrdinateurNewRepository extends JpaRepository<OrdinateurNew, UUID> {
}