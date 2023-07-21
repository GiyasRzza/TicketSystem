package com.example.ticketsystem.repository;

import com.example.ticketsystem.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {

        Ticket findByDescription(String country);
        Ticket findById(long id);
}
