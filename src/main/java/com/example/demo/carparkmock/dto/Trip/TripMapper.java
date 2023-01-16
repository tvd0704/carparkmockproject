package com.example.demo.carparkmock.dto.Trip;

import com.example.demo.carparkmock.enity.Trip;

import java.util.ArrayList;
import java.util.List;

public class TripMapper {

    public static TripResponse tripResponse (Trip trip) {

        TripResponse tripResponse = new TripResponse();
        tripResponse.setId(trip.getTripId());
        tripResponse.setDestination(trip.getDestination());
        tripResponse.setDepartureTime(trip.getDepartureTime());
        tripResponse.setCartype(trip.getCarType());
        tripResponse.setBookedTicketNumber(trip.getBookedTicketNumber());
        return  tripResponse;
    }

    public static List<TripResponse> tripResponseList (List<Trip> tripList) {
        List<TripResponse> tripResponseList = new ArrayList<>();
        for (Trip trip : tripList) {
            tripResponseList.add(tripResponse(trip));
        }
        return tripResponseList;
    }

}
