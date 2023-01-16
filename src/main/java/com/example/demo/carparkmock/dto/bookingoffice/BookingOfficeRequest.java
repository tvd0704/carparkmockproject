package com.example.demo.carparkmock.dto.bookingoffice;

import com.example.demo.carparkmock.dto.Trip.TripRequest;
import com.example.demo.carparkmock.enity.Trip;

import java.util.Date;

public class BookingOfficeRequest {

    private String bookingOfficeName;
    private String phone;
    private String place;
    private Long price;
    private Date fromDate;
    private Date endDate;

    private Long tripId;


    public BookingOfficeRequest() {
    }

    public BookingOfficeRequest(String bookingOfficeName, String phone, String place, Long price, Date fromDate, Date endDate, Long tripId) {
        this.bookingOfficeName = bookingOfficeName;
        this.phone = phone;
        this.place = place;
        this.price = price;
        this.fromDate = fromDate;
        this.endDate = endDate;
        this.tripId = tripId;
    }

    public String getBookingOfficeName() {
        return bookingOfficeName;
    }

    public void setBookingOfficeName(String bookingOfficeName) {
        this.bookingOfficeName = bookingOfficeName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getTripId() {
        return tripId;
    }

    public void setTripId(Long tripId) {
        this.tripId = tripId;
    }

    @Override
    public String toString() {
        return "BookingOfficeRequest{" +
                "bookingOfficeName='" + bookingOfficeName + '\'' +
                ", phone='" + phone + '\'' +
                ", place='" + place + '\'' +
                ", price=" + price +
                ", fromDate=" + fromDate +
                ", endDate=" + endDate +
                ", tripId=" + tripId +
                '}';
    }
}
