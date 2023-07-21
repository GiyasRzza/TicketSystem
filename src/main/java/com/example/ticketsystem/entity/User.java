package com.example.ticketsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {
    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    private String name;

    private String userName;

    private String phone;

    @ManyToOne(cascade = CascadeType.REMOVE)
    private Ticket ticket;

}
