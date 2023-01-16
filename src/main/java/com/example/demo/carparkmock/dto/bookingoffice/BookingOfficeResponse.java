package com.example.demo.carparkmock.dto.bookingoffice;

public class BookingOfficeResponse {


    private Long id;
    private String officeName;

    private String destination;

    public BookingOfficeResponse() {
    }


    public BookingOfficeResponse(Long id, String officeName, String destination) {
        this.id = id;
        this.officeName = officeName;
        this.destination = destination;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "BookingOfficeResponse{" +
                "id=" + id +
                ", officeName='" + officeName + '\'' +
                '}';
    }
}
