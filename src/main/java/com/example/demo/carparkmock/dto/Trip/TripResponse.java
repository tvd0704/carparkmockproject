package com.example.demo.carparkmock.dto.Trip;

import java.util.Date;

public class TripResponse {

    private Long id;
    private String destination;
    private Date departureTime;
    private String driver;
    private String cartype;
    private int bookedTicketNumber;


    public TripResponse() {
    }

    public TripResponse(Long id, String destination, Date departureTime, String driver, String cartype, int bookedTicketNumber) {
        this.id = id;
        this.destination = destination;
        this.departureTime = departureTime;
        this.driver = driver;
        this.cartype = cartype;
        this.bookedTicketNumber = bookedTicketNumber;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public int getBookedTicketNumber() {
        return bookedTicketNumber;
    }

    public void setBookedTicketNumber(int bookedTicketNumber) {
        this.bookedTicketNumber = bookedTicketNumber;
    }
}
