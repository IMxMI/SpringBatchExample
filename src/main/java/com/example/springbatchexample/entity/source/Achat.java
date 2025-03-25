package com.example.springbatchexample.entity.source;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "achat")
public class Achat {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "utilisateur_id", nullable = false)
    private com.example.springbatchexample.entity.source.Utilisateur utilisateur;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "ordinateur_id", nullable = false)
    private com.example.springbatchexample.entity.source.Ordinateur ordinateur;

    @Column(name = "date_achat", nullable = false)
    private LocalDate dateAchat;

}