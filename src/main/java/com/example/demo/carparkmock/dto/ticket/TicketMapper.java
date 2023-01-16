package com.example.demo.carparkmock.dto.ticket;

import com.example.demo.carparkmock.enity.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketMapper {

    public static TicketResponse ticketResponse(Ticket ticket) {
        TicketResponse ticketResponse = new TicketResponse();
        ticketResponse.setTicketId(ticket.getTicketId());
        ticketResponse.setCustomer(ticket.getCustomerName());
        ticketResponse.setDestination(ticket.getTrip().getDestination());
        ticketResponse.setBookingTime(ticket.getBookingTime());
        ticketResponse.setLicensePlate(ticket.getCar().getLicensePlate());
        return ticketResponse;
    }

    public static List<TicketResponse> ticketResponseList(List<Ticket> ticketList) {
        List<TicketResponse> ticketResponseList = new ArrayList<>();
        for (Ticket ticket : ticketList) {
            ticketResponseList.add(ticketResponse(ticket));
        }
        return ticketResponseList;
    }


}
