package com.example.demo.carparkmock.service;

import com.example.demo.carparkmock.dto.bookingoffice.BookingOfficeRequest;
import com.example.demo.carparkmock.dto.bookingoffice.BookingOfficeResponse;
import com.example.demo.carparkmock.enity.BookingOffice;

import java.util.List;

public interface BookingOfficeService {
    public BookingOfficeResponse addBookingOffice(BookingOfficeRequest bookingOfficeRequest);

    public BookingOffice getBookingOfiice(Long id);

    public BookingOfficeResponse getBookingOfficeById(Long id);

    public List<BookingOfficeResponse> getAllBookingOffice();

    public BookingOfficeResponse updateBookingOffice(Long id, BookingOfficeRequest bookingOfficeRequest);

    public BookingOfficeResponse deleteBookingOffice(Long id);

}
