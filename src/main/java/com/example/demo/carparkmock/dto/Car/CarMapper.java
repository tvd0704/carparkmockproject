package com.example.demo.carparkmock.dto.Car;

import com.example.demo.carparkmock.enity.Car;

import java.util.ArrayList;
import java.util.List;

public class CarMapper {

    public static CarResponse carResponse (Car car) {
        CarResponse carResponse = new CarResponse();
        carResponse.setLicensePlate(car.getLicensePlate());
        carResponse.setCarType(car.getCarType());
        carResponse.setCarColor(car.getCarColor());
        carResponse.setCompany(car.getCompany());
        carResponse.setParkingName(carResponse.getParkingName());
        return carResponse;
    }

    public static List<CarResponse> carResponseList (List<Car> carList) {
        List<CarResponse> carResponseList = new ArrayList<>();
        for (Car car:carList) {
            carResponseList.add(carResponse(car));
        }
        return carResponseList;
    }


}
