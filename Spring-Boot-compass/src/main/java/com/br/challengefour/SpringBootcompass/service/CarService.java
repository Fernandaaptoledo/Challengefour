package com.br.challengefour.SpringBootcompass.service;

import com.br.challengefour.SpringBootcompass.CarNotFoundException;
import com.br.challengefour.SpringBootcompass.dto.CarDtoRequest;
import com.br.challengefour.SpringBootcompass.dto.CarDtoResponse;
import com.br.challengefour.SpringBootcompass.entities.CarEntity;
import com.br.challengefour.SpringBootcompass.repository.CarRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CarService {

    @Autowired(required = false)
    private ModelMapper modelMapper;

    @Autowired(required = false)
    private CarRepository carRepository;


    private Object carEntity;


    private Long Chassis;


    public CarDtoResponse save(CarDtoRequest request) {
        CarEntity carEntity = modelMapper.map(request, CarEntity.class);
        carEntity.save(carEntity);
        CarDtoResponse carDtoResponse = modelMapper.map(carEntity, CarDtoResponse.class);
        return carDtoResponse;

    }


    public CarDtoResponse getById(Long Chassis) {
        carRepository.findById(Chassis).orElseThrow(() -> new CarNotFoundException("car with id: " + Chassis + "not found"));
        return modelMapper.map(carEntity, CarDtoResponse.class);

    }

}
