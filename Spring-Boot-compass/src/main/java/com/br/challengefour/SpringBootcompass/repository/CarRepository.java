package com.br.challengefour.SpringBootcompass.repository;

import com.br.challengefour.SpringBootcompass.entities.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Long> {

}
