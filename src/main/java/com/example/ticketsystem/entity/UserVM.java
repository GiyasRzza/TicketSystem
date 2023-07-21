package com.example.ticketsystem.entity;

public class UserVM {
    private String userName;
    private String phone;
    private Ticket ticket;

    public UserVM(User user){
        this.phone  = user.getPhone();
        this.userName= user.getUserName();
        this.ticket=user.getTicket();
    }
}
