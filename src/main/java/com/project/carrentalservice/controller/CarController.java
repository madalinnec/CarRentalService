package com.project.carrentalservice.controller;

import com.project.carrentalservice.domain.Car;
import com.project.carrentalservice.exception.EntityNotFoundException;
import com.project.carrentalservice.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController{

    private CarService carService;

    @Autowired
    public CarController(CarService carService){
        this.carService = carService;
    }

    @GetMapping("/get/{id}")
    public Car getCarById(@PathVariable int id) throws EntityNotFoundException {
        return carService.getCarById(id);
    }

    @GetMapping("/all")
    public List<Car> getAllCars(){
        return carService.getAllCars();
    }

    @PostMapping("/create")
    public void createCar(Car car){
        carService.createCar(car);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCarById(int id){
        carService.deleteCarById(id);
    }
}