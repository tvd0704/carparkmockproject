package com.example.demo.carparkmock.controller;

import com.example.demo.carparkmock.dto.ParkingLot.ParkingLotRequest;
import com.example.demo.carparkmock.dto.ParkingLot.ParkingLotResponse;
import com.example.demo.carparkmock.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/parking")
public class ParkingLotController {

    @Autowired
    private ParkingLotService parkingLotService;

    @PostMapping("/add")
    public ResponseEntity<ParkingLotResponse> addParkingLot (@RequestBody ParkingLotRequest parkingLotRequest) {
        ParkingLotResponse parkingLotResponse = parkingLotService.addParkingLot(parkingLotRequest);
        return new ResponseEntity<>(parkingLotResponse, HttpStatus.OK);
    }

    @GetMapping("/get/{parkinglotId}")
    public ResponseEntity<ParkingLotResponse> getParkingLotById (@PathVariable Long parkinglotId) {
        ParkingLotResponse parkingLotResponse = parkingLotService.getParkingLotById(parkinglotId);
        return new ResponseEntity<>(parkingLotResponse,HttpStatus.OK);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<ParkingLotResponse>> getAllParkinglot () {
        List<ParkingLotResponse> parkingLotResponseList = parkingLotService.getAllParkingLot();
        return new ResponseEntity<>(parkingLotResponseList,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{parkinglotId}")
    public ResponseEntity<ParkingLotResponse> deleteParkinglot (@PathVariable Long parkinglotId) {
        ParkingLotResponse parkingLotResponse = parkingLotService.deleteParkingLot(parkinglotId);
        return new ResponseEntity<>(parkingLotResponse,HttpStatus.OK);
    }

    @PutMapping("/update/{parkinglotId}")
    public ResponseEntity<ParkingLotResponse> updateParkinglot (@PathVariable Long parkingLotId, @RequestBody ParkingLotRequest parkingLotRequest) {
        ParkingLotResponse parkingLotResponse = parkingLotService.updateParkingLot(parkingLotId,parkingLotRequest);
        return new ResponseEntity<>(parkingLotResponse,HttpStatus.OK);
    }

}
