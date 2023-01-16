package com.example.demo.carparkmock.dto.ParkingLot;

public class ParkingLotResponse {

    private Long parkingLotId;
    private String parkingLot;
    private String Place;
    private Long parkingArea;
    private Long price;
    private String status;

    public ParkingLotResponse() {
    }

    public Long getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(Long parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public String getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(String parkingLot) {
        this.parkingLot = parkingLot;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
