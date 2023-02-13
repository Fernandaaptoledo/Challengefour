package com.br.challengefour.SpringBootcompass.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDtoRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String brand;

    @NotBlank
    private String cor;

    @NotBlank
    private String fabricationYear;

}
