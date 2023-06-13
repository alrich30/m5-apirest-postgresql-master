package com.example.demo.repository;

import com.example.demo.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {

    List<Car> findByDoors(Integer doors);
    List<Car> findByManufacterAndModel(String manufacturer, String model);
    List<Car> findByDoorsGreaterThanEqual(Integer doors);
    List<Car> findByModelContaining(String model);
    List<Car> findByYearIn(List<Integer> years);
    List<Car> findByYearBetween(Integer startYear, Integer endYear);
    List<Car> findByReleaseDateBetween(LocalDate startDate, LocalDate endDate);
    List<Car> findByAvailableTrue();

    Long deleteAllByAvailableFalse();

}
