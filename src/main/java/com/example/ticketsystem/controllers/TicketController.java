package com.example.ticketsystem.controllers;

import com.example.ticketsystem.entity.Ticket;
import com.example.ticketsystem.service.TicketService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/1.0")
public class TicketController {
    TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

        @PostMapping(path = "/tickets/{country}")
        public void createTickets(@RequestBody Ticket ticket, @PathVariable(name = "country") String country){
                ticketService.save(ticket,country);
        }
}
