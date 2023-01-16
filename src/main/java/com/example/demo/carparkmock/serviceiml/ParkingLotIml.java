package com.example.demo.carparkmock.serviceiml;

import com.example.demo.carparkmock.dto.ParkingLot.ParkingLotMapper;
import com.example.demo.carparkmock.dto.ParkingLot.ParkingLotRequest;
import com.example.demo.carparkmock.dto.ParkingLot.ParkingLotResponse;
import com.example.demo.carparkmock.enity.ParkingLot;
import com.example.demo.carparkmock.repository.ParkingLotRepository;
import com.example.demo.carparkmock.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingLotIml implements ParkingLotService {

    @Autowired
    private ParkingLotRepository parkingLotRepository;


    @Override
    public ParkingLotResponse addParkingLot(ParkingLotRequest parkingLotRequest) {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setParkName(parkingLotRequest.getParkingName());
        parkingLot.setParkPlace(parkingLotRequest.getParkingPlace());
        parkingLot.setParkArea(parkingLotRequest.getParkingArea());
        parkingLot.setParkPrice(parkingLotRequest.getPrice());
        parkingLotRepository.save(parkingLot);
        return ParkingLotMapper.parkingLotResponse(parkingLot);
    }

    @Override
    public ParkingLot getParkingLot(Long parkingLotId) {
        ParkingLot parkingLot = parkingLotRepository.findById(parkingLotId).orElseThrow(() -> new IllegalArgumentException("can't find parking lot with " + parkingLotId));
        return parkingLot;
    }

    @Override
    public ParkingLotResponse getParkingLotById(Long parkingLotId) {
        ParkingLot parkingLot = getParkingLot(parkingLotId);
        return ParkingLotMapper.parkingLotResponse(parkingLot);

    }

    @Override
    public List<ParkingLotResponse> getAllParkingLot() {
        List<ParkingLot> parkingLotList = parkingLotRepository.findAll();
        return ParkingLotMapper.parkingLotResponseList(parkingLotList);
    }

    @Override
    public ParkingLotResponse deleteParkingLot(Long parkingLotId) {
        ParkingLot parkingLot = getParkingLot(parkingLotId);
        parkingLotRepository.delete(parkingLot);
        return ParkingLotMapper.parkingLotResponse(parkingLot);
    }

    @Override
    public ParkingLotResponse updateParkingLot(Long parkingLotId, ParkingLotRequest parkingLotRequest) {
        ParkingLot parkingLot = getParkingLot(parkingLotId);
        parkingLot.setParkPlace(parkingLotRequest.getParkingPlace());
        parkingLotRepository.save(parkingLot);
        return ParkingLotMapper.parkingLotResponse(parkingLot);
    }
}
