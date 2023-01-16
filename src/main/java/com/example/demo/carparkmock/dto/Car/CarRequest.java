package com.example.demo.carparkmock.dto.Car;

public class CarRequest {

    private String licensePlate;
    private String carType;
    private String carColor;
    private String company;
    private Long parkingLotId;


    public CarRequest() {
    }

    public CarRequest(String licensePlate, String carType, String carColor, String company, Long parkingLotId) {
        this.licensePlate = licensePlate;
        this.carType = carType;
        this.carColor = carColor;
        this.company = company;
        this.parkingLotId = parkingLotId;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Long getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(Long parkingLotId) {
        this.parkingLotId = parkingLotId;
    }
}
