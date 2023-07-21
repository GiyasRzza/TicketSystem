package com.example.ticketsystem.repository;

import com.example.ticketsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User,Long> {


    User getUserByPhone(String phone);
}
