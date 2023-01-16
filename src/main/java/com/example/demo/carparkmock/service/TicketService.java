package com.example.demo.carparkmock.service;

import com.example.demo.carparkmock.dto.ticket.TicketRequest;
import com.example.demo.carparkmock.dto.ticket.TicketResponse;
import com.example.demo.carparkmock.enity.Ticket;

import java.util.List;

public interface TicketService {

    public TicketResponse addTicketResponse (TicketRequest ticketRequest);

    public Ticket getTicket (Long ticketId);

    public TicketResponse getTicketById (Long ticketId);

    public List<TicketResponse> getAllTicket();

    public TicketResponse deleteTicket (Long ticketId);

    public TicketResponse updateTicket (Long ticketId, TicketRequest ticketRequest);

}
