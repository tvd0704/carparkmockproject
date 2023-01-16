package com.example.demo.carparkmock.dto.ticket;

import java.util.Date;

public class TicketRequest {

    private String customer;
    private Date bookingTime;
    private Long tripId;
    private String licensePlate;

    public TicketRequest() {
    }

    public TicketRequest(String customer, Date bookingTime, Long tripId, String licensePlate) {
        this.customer = customer;
        this.bookingTime = bookingTime;
        this.tripId = tripId;
        this.licensePlate = licensePlate;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Date getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }

    public Long getTripId() {
        return tripId;
    }

    public void setTripId(Long tripId) {
        this.tripId = tripId;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
