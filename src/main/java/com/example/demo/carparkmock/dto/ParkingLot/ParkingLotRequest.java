package com.example.demo.carparkmock.dto.ParkingLot;

public class ParkingLotRequest {

    private String parkingName;
    private String parkingPlace;
    private Long parkingArea;
    private Long price;

    public ParkingLotRequest() {
    }

    public ParkingLotRequest(String parkingName, String parkingPlace, Long parkingArea, Long price) {
        this.parkingName = parkingName;
        this.parkingPlace = parkingPlace;
        this.parkingArea = parkingArea;
        this.price = price;
    }

    public String getParkingName() {
        return parkingName;
    }

    public void setParkingName(String parkingName) {
        this.parkingName = parkingName;
    }

    public String getParkingPlace() {
        return parkingPlace;
    }

    public void setParkingPlace(String parkingPlace) {
        this.parkingPlace = parkingPlace;
    }

    public Long getParkingArea() {
        return parkingArea;
    }

    public void setParkingArea(Long parkingArea) {
        this.parkingArea = parkingArea;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
