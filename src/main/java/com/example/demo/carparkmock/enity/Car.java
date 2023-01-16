package com.example.demo.carparkmock.enity;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table
public class Car {
    @Id
    private String licensePlate;
    private String carColor;
    private String carType;
    private String company;
    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private List<Ticket> ticketList;

    @ManyToOne()
    private ParkingLot parkingLot;

    public Car() {
    }

    public Car(String licensePlate, String carColor, String carType, String company, List<Ticket> ticketList, ParkingLot parkingLot) {
        this.licensePlate = licensePlate;
        this.carColor = carColor;
        this.carType = carType;
        this.company = company;
        this.ticketList = ticketList;
        this.parkingLot = parkingLot;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public void setTicketList(List<Ticket> ticketList) {
        this.ticketList = ticketList;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }
}
