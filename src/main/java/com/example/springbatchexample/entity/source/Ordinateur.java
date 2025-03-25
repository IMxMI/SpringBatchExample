package com.example.springbatchexample.entity.source;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ordinateur")
public class Ordinateur {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "label", nullable = false)
    private String label;

    @Column(name = "ram1")
    private Integer ram1;

    @Column(name = "ram2")
    private Integer ram2;

    @Column(name = "ram3")
    private Integer ram3;

    @Column(name = "ram4")
    private Integer ram4;

}