package com.example.springbatchexample.repository.target;

import com.example.springbatchexample.entity.target.Ram;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RamRepository extends JpaRepository<Ram, UUID> {
}