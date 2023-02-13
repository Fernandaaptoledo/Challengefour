package com.br.challengefour.SpringBootcompass.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "CAR")
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @NotEmpty
    private Long Chassis;

    @NotBlank
    @Column(name = "NAME")
    private String name;

    @NotBlank
    @Column(name = "BRAND")
    private String brand;

    @NotBlank
    @Column(name = "COR")
    private String cor;

    @NotBlank
    @Column(name = "FABRICATION_YEAR")
    private String fabricationYear;



    public void save(CarEntity carEntity) {
    }

}
