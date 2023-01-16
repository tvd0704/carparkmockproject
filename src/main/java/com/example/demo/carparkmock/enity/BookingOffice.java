package com.example.demo.carparkmock.enity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class BookingOffice {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long officeId;
    private Date startContractDeadline;
    private Date endContractDeadline;
    private String officeName;
    private String officePhone;
    private String officePlace;
    private Long officePrice;

    @ManyToOne
    private Trip trip;

    public BookingOffice() {
    }

    public BookingOffice(Long officeId, Date startContractDeadline, Date endContractDeadline, String officeName, String officePhone, String officePlace, Long officePrice, Trip trip) {
        this.officeId = officeId;
        this.startContractDeadline = startContractDeadline;
        this.endContractDeadline = endContractDeadline;
        this.officeName = officeName;
        this.officePhone = officePhone;
        this.officePlace = officePlace;
        this.officePrice = officePrice;
        this.trip = trip;
    }

    public Long getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Long officeId) {
        this.officeId = officeId;
    }

    public Date getStartContractDeadline() {
        return startContractDeadline;
    }

    public void setStartContractDeadline(Date startContractDeadline) {
        this.startContractDeadline = startContractDeadline;
    }

    public Date getEndContractDeadline() {
        return endContractDeadline;
    }

    public void setEndContractDeadline(Date endContractDeadline) {
        this.endContractDeadline = endContractDeadline;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getOfficePlace() {
        return officePlace;
    }

    public void setOfficePlace(String officePlace) {
        this.officePlace = officePlace;
    }

    public Long getOfficePrice() {
        return officePrice;
    }

    public void setOfficePrice(Long officePrice) {
        this.officePrice = officePrice;
    }


    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    @Override
    public String toString() {
        return "BookingOffice{" +
                "officeId=" + officeId +
                ", startContractDeadline=" + startContractDeadline +
                ", endContractDeadline=" + endContractDeadline +
                ", officeName='" + officeName + '\'' +
                ", officePhone='" + officePhone + '\'' +
                ", officePlace='" + officePlace + '\'' +
                ", officePrice=" + officePrice +
                ", trip=" + trip +
                '}';
    }
}
