package com.example.demo.carparkmock.dto.bookingoffice;

import com.example.demo.carparkmock.enity.BookingOffice;

import java.util.ArrayList;
import java.util.List;

public class BookingOfficeMapper {

    public static BookingOfficeResponse bookingOfficeResponse (BookingOffice bookingOffice) {


        BookingOfficeResponse bookingOfficeResponse = new BookingOfficeResponse();
        bookingOfficeResponse.setId(bookingOffice.getOfficeId());
        bookingOfficeResponse.setOfficeName(bookingOffice.getOfficeName());
        bookingOfficeResponse.setDestination(bookingOffice.getTrip().getDestination());
        return bookingOfficeResponse;
    }

    public static List<BookingOfficeResponse> bookingOfficeResponseList (List<BookingOffice> bookingOfficeList) {

        List<BookingOfficeResponse> bookingOfficeResponseList = new ArrayList<>();

        for (BookingOffice bookingOffice : bookingOfficeList) {
           bookingOfficeResponseList.add(bookingOfficeResponse(bookingOffice));
        }
        return bookingOfficeResponseList;

    }


}
