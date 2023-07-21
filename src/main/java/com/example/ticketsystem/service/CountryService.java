package com.example.ticketsystem.service;

import com.example.ticketsystem.entity.Country;
import com.example.ticketsystem.repository.CountryRepository;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
    CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public void save(Country country) {
        countryRepository.save(country);
    }
    public Country findCountry(String country){
       return countryRepository.findByName(country);
     }
}
