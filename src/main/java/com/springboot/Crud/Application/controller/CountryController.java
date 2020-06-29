package com.springboot.Crud.Application.controller;


import com.springboot.Crud.Application.Model.City;
import com.springboot.Crud.Application.Model.Country;
import com.springboot.Crud.Application.service.CityService;
import com.springboot.Crud.Application.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/country")
public class CountryController {
    @Autowired
    private CountryService service;

    @GetMapping
    private List<Country> getAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    private Country getById(@PathVariable UUID id) {
        return service.getById(id);
    }

    @PostMapping
    private Country addCountry(@RequestBody Country country) {
        return  service.addCountry(country);
    }

    @PutMapping("/{id}")
    private Country updateCountry (@PathVariable UUID id, @RequestBody Country country) {
       country.setCountryId(id);
       return service.addCountry(country);
    }
    @DeleteMapping("/{id}")
    private String delete(@PathVariable UUID id) {
        return service.deleteById(id);
    }
}
