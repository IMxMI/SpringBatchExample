package com.example.springbatchexample.entity.target;

import  jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "achat_new")
public class AchatNew {
    @Id
    @ColumnDefault("gen_random_uuid()")
    @Column(name = "uuid", nullable = false)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "utilisateur_uuid", nullable = false)
    private com.example.springbatchexample.entity.target.UtilisateurNew utilisateurUuid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "ordinateur_uuid", nullable = false)
    private com.example.springbatchexample.entity.target.OrdinateurNew ordinateurUuid;

    @Column(name = "date_achat", nullable = false)
    private LocalDate dateAchat;

}