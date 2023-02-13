package com.br.challengefour.SpringBootcompass.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDtoRequest {


    private Long Chassis;


    private String name;


    private String brand;


    private String cor;


    private String fabricationYear;

}
