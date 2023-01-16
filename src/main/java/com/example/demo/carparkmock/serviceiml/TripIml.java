package com.example.demo.carparkmock.serviceiml;

import com.example.demo.carparkmock.dto.Trip.TripMapper;
import com.example.demo.carparkmock.dto.Trip.TripRequest;
import com.example.demo.carparkmock.dto.Trip.TripResponse;
import com.example.demo.carparkmock.enity.Trip;
import com.example.demo.carparkmock.repository.TripRepository;
import com.example.demo.carparkmock.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TripIml implements TripService {

    @Autowired
    private TripRepository tripRepository;

    @Override
    public TripResponse addTrip(TripRequest tripRequest) {
        Trip trip = new Trip();
        trip.setDestination(tripRequest.getDestination());
        trip.setDepartureTime(tripRequest.getDepartureTime());
        trip.setDriver(tripRequest.getDriver());
        trip.setCarType(tripRequest.getCarType());
        trip.setMaximumOnlineTicketNumber(tripRequest.getMaximumOnlineTicketNumber());
        trip.setDepartureDate(tripRequest.getDepartureDate());
        tripRepository.save(trip);
        return TripMapper.tripResponse(trip);
    }

    @Override
    public Trip getTrip(Long tripId) {
        Trip trip = tripRepository.findById(tripId).orElseThrow(() -> new IllegalArgumentException("can't find with trip " + tripId));
        return trip;
    }

    @Override
    public TripResponse getTripById(Long tripId) {
        Trip trip = getTrip(tripId);
        return TripMapper.tripResponse(trip);
    }

    @Override
    public List<TripResponse> getAllTrip() {
        List<Trip> tripList = tripRepository.findAll();

        return TripMapper.tripResponseList(tripList);
    }

    @Override
    public TripResponse deleteTrip(Long tripId) {
        Trip trip = getTrip(tripId);
        tripRepository.delete(trip);
        return TripMapper.tripResponse(trip);
    }

    @Override
    public TripResponse updateTrip(Long tripId, TripRequest tripRequest) {
        Trip trip = new Trip();
        trip.setDestination(tripRequest.getDestination());
        trip.setCarType(tripRequest.getCarType());
        return TripMapper.tripResponse(trip);
    }
}
