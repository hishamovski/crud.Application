package com.springboot.Crud.Application.controller;


import com.springboot.Crud.Application.Model.City;
import com.springboot.Crud.Application.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/city")
public class CityCountroller {
    @Autowired
    private CityService cityService;

    @GetMapping
    private List<City> getAll(){
        return cityService.findAll();
    }

    @GetMapping("/{id}")
    private City getById(@PathVariable UUID id) {
        return cityService.getById(id);
    }

    @PostMapping
    private City addCity(@RequestBody City city) {
        return  cityService.addCity(city);
    }

    @PutMapping("/{id}")
    private City updateCity (@PathVariable UUID id, @RequestBody City city) {
        city.setCityId(id);
        return cityService.addCity(city);
    }
    @DeleteMapping("/{id}")
    private String delete(@PathVariable UUID cityId) {
        return cityService.deleteById(cityId);
    }
}
