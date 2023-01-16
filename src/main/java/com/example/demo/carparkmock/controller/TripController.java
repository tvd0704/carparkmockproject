package com.example.demo.carparkmock.controller;

import com.example.demo.carparkmock.dto.Trip.TripRequest;
import com.example.demo.carparkmock.dto.Trip.TripResponse;
import com.example.demo.carparkmock.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/trip")
public class TripController {

    @Autowired
    private TripService tripService;

    @PostMapping("/add")
    public ResponseEntity<TripResponse> addTrip (@RequestBody final TripRequest tripRequest) {
        TripResponse tripResponse = tripService.addTrip(tripRequest);
        return new ResponseEntity<>(tripResponse, HttpStatus.OK);
    }

    @GetMapping("/get/{tripId}")
    public ResponseEntity<TripResponse> getTripById (@PathVariable final Long tripId) {
        TripResponse tripResponse = tripService.getTripById(tripId);
        return new ResponseEntity<>(tripResponse,HttpStatus.OK);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<TripResponse>> getAllTrip () {
        List<TripResponse> tripResponseList = tripService.getAllTrip();
        return new ResponseEntity<>(tripResponseList,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{tripId}")
    public ResponseEntity<TripResponse> deleteTrip (@PathVariable final Long tripId) {
        TripResponse tripResponse = tripService.deleteTrip(tripId);
        return new ResponseEntity<>(tripResponse,HttpStatus.OK);
    }

    @PutMapping("/update/{tripId}")
    public ResponseEntity<TripResponse> updateTrip (@PathVariable final Long tripId, @RequestBody TripRequest tripRequest) {
        TripResponse tripResponse = tripService.updateTrip(tripId,tripRequest);
        return new ResponseEntity<>(tripResponse,HttpStatus.OK);
    }


}
