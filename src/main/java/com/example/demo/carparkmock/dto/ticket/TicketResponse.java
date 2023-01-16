package com.example.demo.carparkmock.dto.ticket;

import java.util.Date;

public class TicketResponse {

    private Long ticketId;
    private String destination;
    private String licensePlate;
    private String customer;
    private Date bookingTime;

    public TicketResponse() {
    }

    public TicketResponse(Long ticketId, String destination, String licensePlate, String customer, Date bookingTime) {
        this.ticketId = ticketId;
        this.destination = destination;
        this.licensePlate = licensePlate;
        this.customer = customer;
        this.bookingTime = bookingTime;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
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
}
