package com.example.demo.carparkmock.serviceiml;

import com.example.demo.carparkmock.dto.bookingoffice.BookingOfficeMapper;
import com.example.demo.carparkmock.dto.bookingoffice.BookingOfficeRequest;
import com.example.demo.carparkmock.dto.bookingoffice.BookingOfficeResponse;
import com.example.demo.carparkmock.enity.BookingOffice;
import com.example.demo.carparkmock.enity.Trip;
import com.example.demo.carparkmock.repository.BookingOfficeRepository;
import com.example.demo.carparkmock.repository.TripRepository;
import com.example.demo.carparkmock.service.BookingOfficeService;
import com.example.demo.carparkmock.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BookingOfficeIml implements BookingOfficeService {

    @Autowired
    private BookingOfficeRepository bookingOfficeRepository;

    @Autowired
    private TripService tripService;

    @Autowired
    private TripRepository tripRepository;


    @Override
    public BookingOfficeResponse addBookingOffice(BookingOfficeRequest bookingOfficeRequest) {
        BookingOffice bookingOffice = new BookingOffice();
        bookingOffice.setOfficeName(bookingOfficeRequest.getBookingOfficeName());
        bookingOffice.setOfficePhone(bookingOfficeRequest.getPhone());
        bookingOffice.setOfficePlace(bookingOfficeRequest.getPlace());
        bookingOffice.setOfficePrice(bookingOfficeRequest.getPrice());
        bookingOffice.setStartContractDeadline(bookingOfficeRequest.getFromDate());
        bookingOffice.setEndContractDeadline(bookingOfficeRequest.getEndDate());

        Trip trip = tripService.getTrip(bookingOfficeRequest.getTripId());

        bookingOffice.setTrip(trip);


        bookingOfficeRepository.save(bookingOffice);
        return BookingOfficeMapper.bookingOfficeResponse(bookingOffice);
    }

    @Override
    public BookingOffice getBookingOfiice(Long id) {
        BookingOffice bookingOffice = bookingOfficeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("can't find booking office " + id));
        return bookingOffice;
    }

    @Override
    public BookingOfficeResponse getBookingOfficeById(Long id) {
        BookingOffice bookingOffice = getBookingOfiice(id);
        return BookingOfficeMapper.bookingOfficeResponse(bookingOffice);
    }

    @Override
    public List<BookingOfficeResponse> getAllBookingOffice() {
        List<BookingOffice> bookingOfficeList = bookingOfficeRepository.findAll();

        return BookingOfficeMapper.bookingOfficeResponseList(bookingOfficeList);
    }

    @Override
    public BookingOfficeResponse updateBookingOffice(Long id, BookingOfficeRequest bookingOfficeRequest) {
        BookingOffice bookingOffice = getBookingOfiice(id);
        bookingOffice.setOfficeName(bookingOfficeRequest.getBookingOfficeName());

        return BookingOfficeMapper.bookingOfficeResponse(bookingOffice);
    }

    @Override
    public BookingOfficeResponse deleteBookingOffice(Long id) {
        BookingOffice bookingOffice = getBookingOfiice(id);
        bookingOfficeRepository.delete(bookingOffice);
        return BookingOfficeMapper.bookingOfficeResponse(bookingOffice);
    }
}
