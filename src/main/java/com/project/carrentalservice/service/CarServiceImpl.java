package com.project.carrentalservice.service;

import com.project.carrentalservice.domain.Car;
import com.project.carrentalservice.exception.EntityNotFoundException;
import com.project.carrentalservice.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService{

    private CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    @Override
    public void createCar(Car car) {
        carRepository.save(car);
    }

    @Override
    public Car getCarById(int id) throws EntityNotFoundException {
        Optional<Car> optional = carRepository.findById(id);
        if (optional.isPresent()){
            return optional.get();
        }
        throw new EntityNotFoundException(String.format("The object with id %s doesn't exist in the database", id));
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public void deleteCarById(int id) {
        carRepository.deleteById(id);
    }
}
