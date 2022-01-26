package com.project.carrentalservice.service;

import com.project.carrentalservice.domain.Car;
import com.project.carrentalservice.exception.EntityNotFoundException;

import java.util.List;

public interface CarService {

    void createCar(Car car);

    Car getCarById(int id) throws EntityNotFoundException;

    List<Car> getAllCars();

    void deleteCarById(int id);
}
