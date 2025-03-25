package com.example.springbatchexample.entity.target;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "ordinateur_new")
public class OrdinateurNew {
    @Id
    @ColumnDefault("gen_random_uuid()")
    @Column(name = "uuid", nullable = false)
    private UUID id;

    @Column(name = "label", nullable = false)
    private String label;

    @OneToMany(mappedBy = "ordinateurUuid", orphanRemoval = true)
    private Set<Ram> rams = new LinkedHashSet<>();

}