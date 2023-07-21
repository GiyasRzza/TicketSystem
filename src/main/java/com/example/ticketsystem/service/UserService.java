package com.example.ticketsystem.service;

import com.example.ticketsystem.entity.Ticket;
import com.example.ticketsystem.entity.User;
import com.example.ticketsystem.entity.UserVM;
import com.example.ticketsystem.repository.UserRepository;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    UserRepository userRepository;
    TicketService ticketService;

    public UserService(UserRepository userRepository,TicketService ticketService) {
        this.userRepository = userRepository;
        this.ticketService = ticketService;
    }


//    public void save(User user,long id){
//        Ticket  tickets= ticketService.findTicket(id);
//        if (tickets !=null) {
//            user.setTicket(tickets);
//            userRepository.save(user);
//        }

            public void save(User user,long id){
               Ticket isNotEmpty =  ticketService.findTicket(id);
                if (isNotEmpty != null) {
                    user.setTicket(isNotEmpty);
                    userRepository.save(user);
                }
            }


    public User getUser(String phone) {
       User inDBuser =  userRepository.getUserByPhone(phone);
       return inDBuser;

    }
}

