package com.example.demo.carparkmock.dto.ParkingLot;

import com.example.demo.carparkmock.enity.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotMapper {

    public static ParkingLotResponse parkingLotResponse(ParkingLot parkingLot) {
        ParkingLotResponse parkingLotResponse = new ParkingLotResponse();
        parkingLotResponse.setParkingLotId(parkingLot.getParkId());
        parkingLotResponse.setParkingLot(parkingLot.getParkName());
        parkingLotResponse.setPlace(parkingLot.getParkPlace());
        parkingLotResponse.setParkingArea(parkingLot.getParkArea());
        parkingLotResponse.setPrice(parkingLot.getParkPrice());
        parkingLotResponse.setStatus(parkingLot.getParkStatus());
        return parkingLotResponse;
    }

    public static List<ParkingLotResponse> parkingLotResponseList(List<ParkingLot> parkingLotList) {
        List<ParkingLotResponse> parkingLotResponseList = new ArrayList<>();

        for (ParkingLot parkingLot : parkingLotList) {
            parkingLotResponseList.add(parkingLotResponse(parkingLot));
        }
        return parkingLotResponseList;
    }

}
