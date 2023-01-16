package com.example.demo.carparkmock.serviceiml;

import com.example.demo.carparkmock.dto.Trip.TripMapper;
import com.example.demo.carparkmock.dto.ticket.TicketMapper;
import com.example.demo.carparkmock.dto.ticket.TicketRequest;
import com.example.demo.carparkmock.dto.ticket.TicketResponse;
import com.example.demo.carparkmock.enity.Car;
import com.example.demo.carparkmock.enity.Ticket;
import com.example.demo.carparkmock.enity.Trip;
import com.example.demo.carparkmock.repository.TicketRepository;
import com.example.demo.carparkmock.repository.TripRepository;
import com.example.demo.carparkmock.service.TicketService;
import com.example.demo.carparkmock.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TicketIml implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;
    @Autowired
    private TripService tripService;
    @Autowired
    private TripRepository tripRepository;

    @Override
    public TicketResponse addTicketResponse(TicketRequest ticketRequest) {
       Ticket ticket = new Ticket();
      ticket.setCustomerName(ticketRequest.getCustomer());
      ticket.setBookingTime(ticketRequest.getBookingTime());
      Trip trip = tripService.getTrip(ticketRequest.getTripId());

      ticket.setTrip(trip);
      ticketRepository.save(ticket);
      return TicketMapper.ticketResponse(ticket);
    }

    @Override
    public Ticket getTicket(Long ticketId) {
        Ticket ticket = ticketRepository.findById(ticketId).orElseThrow(() -> new IllegalArgumentException("can't find ticket "+ticketId));
        return ticket;
    }

    @Override
    public TicketResponse getTicketById(Long ticketId) {
       Ticket ticket = getTicket(ticketId);
       return TicketMapper.ticketResponse(ticket);
    }

    @Override
    public List<TicketResponse> getAllTicket() {
        List<Ticket> ticketList = ticketRepository.findAll();
        return TicketMapper.ticketResponseList(ticketList);
    }

    @Override
    public TicketResponse deleteTicket(Long ticketId) {
        Ticket ticket = getTicket(ticketId);
        ticketRepository.delete(ticket);
        return TicketMapper.ticketResponse(ticket);

    }
    @Override
    public TicketResponse updateTicket(Long ticketId, TicketRequest ticketRequest) {
        Ticket ticket =getTicket(ticketId);
        ticket.setCustomerName(ticketRequest.getCustomer());
        return TicketMapper.ticketResponse(ticket);
    }
}
