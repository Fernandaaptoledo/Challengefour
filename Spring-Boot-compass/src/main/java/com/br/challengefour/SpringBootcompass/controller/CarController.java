package com.br.challengefour.SpringBootcompass.controller;

import com.br.challengefour.SpringBootcompass.dto.CarDtoRequest;
import com.br.challengefour.SpringBootcompass.dto.CarDtoResponse;
import com.br.challengefour.SpringBootcompass.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value="/api")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping("/car/save")
    public ResponseEntity<CarDtoResponse> save(@RequestBody @Valid CarDtoRequest request){
        CarDtoResponse carDtoResponse = carService.save(request);
        return ResponseEntity.ok(carDtoResponse);
    }

    @GetMapping("/car/get/{idcCassi}")
    public ResponseEntity<CarDtoResponse> getById(@PathVariable Long idcCassi){
        CarDtoResponse carDtoResponse = carService.getById(idcCassi);
        return ResponseEntity.ok(carDtoResponse);
    }
}
