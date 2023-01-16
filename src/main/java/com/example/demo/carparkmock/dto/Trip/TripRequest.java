package com.example.demo.carparkmock.dto.Trip;

import java.util.Date;

public class TripRequest {
    private String destination;
    private Date departureTime;
    private String driver;
    private String carType;

    private int maximumOnlineTicketNumber;
    private Date departureDate;

    public TripRequest() {
    }

    public TripRequest(String destination, Date departureTime, String driver, String carType, int maximumOnlineTicketNumber, Date departureDate) {
        this.destination = destination;
        this.departureTime = departureTime;
        this.driver = driver;
        this.carType = carType;
        this.maximumOnlineTicketNumber = maximumOnlineTicketNumber;
        this.departureDate = departureDate;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public int getMaximumOnlineTicketNumber() {
        return maximumOnlineTicketNumber;
    }

    public void setMaximumOnlineTicketNumber(int maximumOnlineTicketNumber) {
        this.maximumOnlineTicketNumber = maximumOnlineTicketNumber;
    }
}
