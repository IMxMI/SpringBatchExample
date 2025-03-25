package com.example.springbatchexample.dto.target;

import lombok.*;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link com.example.springbatchexample.entity.target.UtilisateurNew}
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UtilisateurNewDto implements Serializable {
    private UUID id;
    private String nom;
    private String email;
}