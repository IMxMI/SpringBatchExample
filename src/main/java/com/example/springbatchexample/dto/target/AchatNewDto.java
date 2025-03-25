package com.example.springbatchexample.dto.target;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

/**
 * DTO for {@link com.example.springbatchexample.entity.target.AchatNew}
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AchatNewDto implements Serializable {
    UUID id;
    UtilisateurNewDto utilisateurUuid;
    OrdinateurNewDto ordinateurUuid;
    LocalDate dateAchat;
}