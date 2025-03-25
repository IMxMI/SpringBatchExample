package com.example.springbatchexample.repository.target;

import com.example.springbatchexample.entity.target.AchatNew;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AchatNewRepository extends JpaRepository<AchatNew, UUID> {
}