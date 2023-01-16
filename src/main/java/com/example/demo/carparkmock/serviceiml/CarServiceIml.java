package com.example.demo.carparkmock.serviceiml;

import com.example.demo.carparkmock.dto.Car.CarMapper;
import com.example.demo.carparkmock.dto.Car.CarRequest;
import com.example.demo.carparkmock.dto.Car.CarResponse;
import com.example.demo.carparkmock.enity.Car;
import com.example.demo.carparkmock.enity.ParkingLot;
import com.example.demo.carparkmock.repository.CarRepository;
import com.example.demo.carparkmock.service.CarService;
import com.example.demo.carparkmock.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceIml implements CarService {

    @Autowired
    private ParkingLotService parkingLotService;
    @Autowired
    private CarRepository carRepository;


    @Override
    public CarResponse addCar(CarRequest carRequest) {
        Car car = new Car();
        car.setLicensePlate(carRequest.getLicensePlate());
        car.setCarType(carRequest.getCarType());
        car.setCarColor(carRequest.getCarColor());
        car.setCompany(carRequest.getCompany());
        ParkingLot parkingLot = parkingLotService.getParkingLot(carRequest.getParkingLotId());
        car.setParkingLot(parkingLot);
        carRepository.save(car);
        return CarMapper.carResponse(car);
    }

    @Override
    public Car getCar(String carId) {
        Car car = carRepository.findById(carId).orElseThrow(()-> new IllegalArgumentException("can't find with " +carId));
        return car;
    }

    @Override
    public CarResponse getCarById(String carId) {
        Car car = getCar(carId);
        return CarMapper.carResponse(car);
    }

    @Override
    public List<CarResponse> getAllCar() {
        List<Car> carList = carRepository.findAll();
        return CarMapper.carResponseList(carList);
    }

    @Override
    public CarResponse deleteCar(String carId) {
       Car car = getCar(carId);
       return CarMapper.carResponse(car);
    }

    @Override
    public CarResponse updateCar(String carId, CarRequest carRequest) {
        Car car = getCar(carId);
        car.setCarType(carRequest.getCarType());
        carRepository.save(car);
        return CarMapper.carResponse(car);
    }
}
