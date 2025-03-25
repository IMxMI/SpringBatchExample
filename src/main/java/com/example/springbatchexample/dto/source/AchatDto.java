package com.example.springbatchexample.dto.source;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.example.springbatchexample.entity.source.Achat}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AchatDto implements Serializable {
    private Integer id;
    private UtilisateurDto utilisateur;
    private OrdinateurDto ordinateur;
    private LocalDate dateAchat;
}