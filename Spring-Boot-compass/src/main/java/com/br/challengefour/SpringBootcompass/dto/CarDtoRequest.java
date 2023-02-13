package com.br.challengefour.SpringBootcompass.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDtoRequest {

    @NotNull
    private Long idCassi;

    @NotBlank
    private String name;

    @NotBlank
    private String brand;

    @NotBlank
    private String cor;

    @NotBlank
    private String fabricationYear;

}
