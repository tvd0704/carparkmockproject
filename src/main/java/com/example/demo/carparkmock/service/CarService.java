package com.example.demo.carparkmock.service;

import com.example.demo.carparkmock.dto.Car.CarRequest;
import com.example.demo.carparkmock.dto.Car.CarResponse;
import com.example.demo.carparkmock.enity.Car;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CarService {

    public CarResponse addCar (CarRequest carRequest);
    public Car getCar (String carId);
    public CarResponse getCarById (String carId);
    public List<CarResponse> getAllCar ();
    public CarResponse deleteCar (String carId);
    public CarResponse updateCar (String carId, CarRequest carRequest);
}
