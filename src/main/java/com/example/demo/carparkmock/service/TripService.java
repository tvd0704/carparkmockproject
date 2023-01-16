package com.example.demo.carparkmock.service;

import com.example.demo.carparkmock.dto.Trip.TripRequest;
import com.example.demo.carparkmock.dto.Trip.TripResponse;
import com.example.demo.carparkmock.enity.Trip;

import java.util.List;

public interface TripService {

    public TripResponse addTrip(TripRequest tripRequest);
    public Trip getTrip (Long tripId);
    public TripResponse getTripById(Long tripId);
    public List<TripResponse> getAllTrip ();
    public TripResponse deleteTrip (Long tripId);
    public TripResponse updateTrip (Long tripId, TripRequest tripRequest);

}
