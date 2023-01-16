package com.example.demo.carparkmock.controller;

import com.example.demo.carparkmock.dto.ticket.TicketRequest;
import com.example.demo.carparkmock.dto.ticket.TicketResponse;
import com.example.demo.carparkmock.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/add/ticket")
    public ResponseEntity<TicketResponse> addTicket (@RequestBody TicketRequest ticketRequest) {
        TicketResponse ticketResponse = ticketService.addTicketResponse(ticketRequest);
        return new ResponseEntity<>(ticketResponse, HttpStatus.OK);
    }

    @GetMapping("/get/{ticketId}")
    public ResponseEntity<TicketResponse> getTicketById (@PathVariable Long ticketId) {
        TicketResponse ticketResponse = ticketService.getTicketById(ticketId);
        return new ResponseEntity<>(ticketResponse,HttpStatus.OK);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<TicketResponse>> getAllTicket () {
        List<TicketResponse> ticketResponseList = ticketService.getAllTicket();
        return new ResponseEntity<>(ticketResponseList,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{ticketId}")
    public ResponseEntity<TicketResponse> deleteTicket (@PathVariable Long ticketId) {
        TicketResponse ticketResponse = ticketService.deleteTicket(ticketId);
        return new ResponseEntity<>(ticketResponse,HttpStatus.OK);
    }

    @PutMapping("/update/{ticketId}")
    public ResponseEntity<TicketResponse> updateTicket (@PathVariable Long ticketId, @RequestBody TicketRequest ticketRequest) {
        TicketResponse ticketResponse = ticketService.updateTicket(ticketId,ticketRequest);
        return new ResponseEntity<>(ticketResponse,HttpStatus.OK);
    }

}
