package com.example.ticketsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Ticket {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Status status;

    private String description;

    private Double price;

    @OneToOne
    private Country countries ;

}
