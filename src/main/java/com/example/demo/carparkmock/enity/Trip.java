package com.example.demo.carparkmock.enity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tripId;
    private int bookedTicketNumber;
    private String carType;
    private Date departureDate;
    private Date departureTime;
    private String destination;
    private String driver;
    private int maximumOnlineTicketNumber;

    @OneToMany(mappedBy = "trip",cascade = CascadeType.ALL)
    private List<BookingOffice> bookingOfficeList;

    @OneToMany(mappedBy = "trip", cascade = CascadeType.ALL)
    private List<Ticket> ticketList;


    public Trip() {
    }

    public Trip(Long tripId, int bookedTicketNumber, String carType, Date departureDate, Date departureTime, String destination, String driver, int maximumOnlineTicketNumber, List<BookingOffice> bookingOfficeList) {
        this.tripId = tripId;
        this.bookedTicketNumber = bookedTicketNumber;
        this.carType = carType;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.destination = destination;
        this.driver = driver;
        this.maximumOnlineTicketNumber = maximumOnlineTicketNumber;
        this.bookingOfficeList = bookingOfficeList;
    }

    public Long getTripId() {
        return tripId;
    }

    public void setTripId(Long tripId) {
        this.tripId = tripId;
    }

    public int getBookedTicketNumber() {
        return bookedTicketNumber;
    }

    public void setBookedTicketNumber(int bookedTicketNumber) {
        this.bookedTicketNumber = bookedTicketNumber;
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

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getMaximumOnlineTicketNumber() {
        return maximumOnlineTicketNumber;
    }

    public void setMaximumOnlineTicketNumber(int maximumOnlineTicketNumber) {
        this.maximumOnlineTicketNumber = maximumOnlineTicketNumber;
    }

    public List<BookingOffice> getBookingOfficeList() {
        return bookingOfficeList;
    }

    public void setBookingOfficeList(List<BookingOffice> bookingOfficeList) {
        this.bookingOfficeList = bookingOfficeList;
    }
}
