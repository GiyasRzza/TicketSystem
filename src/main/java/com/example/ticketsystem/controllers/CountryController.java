package com.example.ticketsystem.controllers;

import com.example.ticketsystem.entity.Country;
import com.example.ticketsystem.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/1.0")
@RequiredArgsConstructor
public class CountryController {
    private final CountryService countryService;

    @PostMapping(path = "/countries")
    public void createCountry(@RequestBody Country country){
        countryService.save(country);
    }
}
