package com.example.demo.carparkmock.dto.Car;

public class CarResponse {

    private String licensePlate;
    private String carType;
    private String carColor;
    private String company;
    private String parkingName;

    public CarResponse() {
    }

    public CarResponse(String licensePlate, String carType, String carColor, String company, String parkingName) {
        this.licensePlate = licensePlate;
        this.carType = carType;
        this.carColor = carColor;
        this.company = company;
        this.parkingName = parkingName;
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

    public String getParkingName() {
        return parkingName;
    }

    public void setParkingName(String parkingName) {
        this.parkingName = parkingName;
    }
}
