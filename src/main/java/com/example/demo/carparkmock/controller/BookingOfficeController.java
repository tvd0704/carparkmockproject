package com.example.demo.carparkmock.controller;

import com.example.demo.carparkmock.dto.bookingoffice.BookingOfficeRequest;
import com.example.demo.carparkmock.dto.bookingoffice.BookingOfficeResponse;
import com.example.demo.carparkmock.enity.BookingOffice;
import com.example.demo.carparkmock.service.BookingOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/bookingoffice")
public class BookingOfficeController {

    @Autowired
    private BookingOfficeService bookingOfficeService;

    @PostMapping("/add")
    public ResponseEntity<BookingOfficeResponse> addBookingOffice(@RequestBody final BookingOfficeRequest bookingOfficeRequest) {
        BookingOfficeResponse bookingOfficeResponse = bookingOfficeService.addBookingOffice(bookingOfficeRequest);
        return new ResponseEntity<>(bookingOfficeResponse, HttpStatus.OK);
    }

    @GetMapping("/get/{bookingOfficeId}")
    public ResponseEntity<BookingOfficeResponse> getBookingOffice(@PathVariable final Long bookingOfficeId) {
        BookingOfficeResponse bookingOfficeResponse = bookingOfficeService.getBookingOfficeById(bookingOfficeId);
        return new ResponseEntity<>(bookingOfficeResponse, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<BookingOfficeResponse>> getAllBookingOffice() {
        List<BookingOfficeResponse> bookingOfficeResponseList = bookingOfficeService.getAllBookingOffice();
        return new ResponseEntity<>(bookingOfficeResponseList, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{bookingOfficeId}")
    public ResponseEntity<BookingOfficeResponse> deleteBookingOffice(@PathVariable final Long bookingOfficeId) {
        BookingOfficeResponse bookingOfficeResponse = bookingOfficeService.deleteBookingOffice(bookingOfficeId);
        return new ResponseEntity<>(bookingOfficeResponse, HttpStatus.OK);
    }

    @PostMapping("/update/{bookingOfficeId}")
    public ResponseEntity<BookingOfficeResponse> updateBookingOffice(@PathVariable final Long bookingOfficeId, @RequestBody BookingOfficeRequest bookingOfficeRequest) {
        BookingOfficeResponse bookingOfficeResponse = bookingOfficeService.updateBookingOffice(bookingOfficeId, bookingOfficeRequest);
        return new ResponseEntity<>(bookingOfficeResponse, HttpStatus.OK);
    }


}
