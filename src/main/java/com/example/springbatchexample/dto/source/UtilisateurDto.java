package com.example.springbatchexample.dto.source;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link com.example.springbatchexample.entity.source.Utilisateur}
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UtilisateurDto implements Serializable {
    private Integer id;
    private String nom;
    private String email;
}