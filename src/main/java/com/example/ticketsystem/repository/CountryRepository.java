package com.example.ticketsystem.repository;

import com.example.ticketsystem.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
          Country findByName(String name);
}
