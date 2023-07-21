package com.example.ticketsystem.service;

import com.example.ticketsystem.entity.Country;
import com.example.ticketsystem.entity.Ticket;
import com.example.ticketsystem.repository.TicketRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TicketService {

        TicketRepository ticketRepository;
        CountryService countryService;

    public TicketService(TicketRepository ticketRepository,CountryService countryService) {
        this.ticketRepository = ticketRepository;
        this.countryService = countryService;
    }

    public void save(Ticket ticket,String country) {
        Country inDB = countryService.findCountry(country);
        if (inDB != null) {
            ticket.setCountries(inDB);
            ticketRepository.save(ticket);
        }
    }

    public Ticket findTicket(long id){
       Ticket inDB =ticketRepository.findById(id);
        if (inDB!=null) {
            return ticketRepository.findById(id);
        }
        else {
            return (Ticket) ResponseEntity.status(HttpStatus.BAD_REQUEST);
        }



    }


    public Ticket findCountryTicket(String couString){
        return  ticketRepository.findByDescription(couString);
    }
}
