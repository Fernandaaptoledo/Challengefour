package com.br.challengefour.SpringBootcompass.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "CAR")
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCassi;

    @Column(name = "NAME")
    private String name;

    @Column(name = "BRAND")
    private String brand;

    @Column(name = "COR")
    private String cor;

    @Column(name = "FABRICATION YEAR")
    private String fabricationYear;

    public void save(CarEntity carEntity) {

    }
}
