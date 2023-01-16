package com.example.demo.carparkmock.service;

import com.example.demo.carparkmock.dto.ParkingLot.ParkingLotRequest;
import com.example.demo.carparkmock.dto.ParkingLot.ParkingLotResponse;
import com.example.demo.carparkmock.enity.ParkingLot;

import java.util.List;

public interface ParkingLotService {


    public ParkingLotResponse addParkingLot(ParkingLotRequest parkingLotRequest);

    public ParkingLot getParkingLot(Long parkingLotId);

    public ParkingLotResponse getParkingLotById(Long parkingLotId);

    public List<ParkingLotResponse> getAllParkingLot();

    public ParkingLotResponse deleteParkingLot(Long parkingLotId);

    public ParkingLotResponse updateParkingLot(Long parkingLotId, ParkingLotRequest parkingLotRequest);
}
