package com.example.demo.carparkmock.controller;

import com.example.demo.carparkmock.dto.Car.CarRequest;
import com.example.demo.carparkmock.dto.Car.CarResponse;
import com.example.demo.carparkmock.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/car")
public class CarController {

    @Autowired
    private CarService carService;


    @PostMapping("/add")
    public ResponseEntity<CarResponse> addCar (@RequestBody CarRequest carRequest) {
        CarResponse carResponse = carService.addCar(carRequest);
        return new ResponseEntity<>(carResponse, HttpStatus.OK);
    }

    @GetMapping("/get/{carId}")
    public ResponseEntity<CarResponse> getCarById (@PathVariable final String carId) {
        CarResponse carResponse = carService.getCarById(carId);
        return new ResponseEntity<>(carResponse,HttpStatus.OK);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<CarResponse>> getAllCar () {
        List<CarResponse> carResponseList = carService.getAllCar();
        return new ResponseEntity<>(carResponseList,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{carId}")
    public ResponseEntity<CarResponse> deleteCar (@PathVariable String carId) {
        CarResponse carResponse = carService.deleteCar(carId);
        return new ResponseEntity<>(carResponse,HttpStatus.OK);
    }

    @PutMapping("/update/{carId}")
    public ResponseEntity<CarResponse> updateCar (@PathVariable String carId, @RequestBody CarRequest carRequest) {
        CarResponse carResponse = carService.updateCar(carId, carRequest);
        return new ResponseEntity<>(carResponse,HttpStatus.OK);
    }








}
