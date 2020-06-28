package com.springboot.Crud.Application.service;

import com.springboot.Crud.Application.Model.City;
import com.springboot.Crud.Application.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public City addCity(City city){
        return cityRepository.save(city);
    }

    public String deleteById(UUID id){
        if (getById(id) != null){
            cityRepository.deleteById(id);
            return "" + id + " deleted";
        } else {
            return "not found to delete";
        }

    }

    public List<City> findAll(){
        return cityRepository.findAll();
    }

    public City getById(UUID id){
        return cityRepository.findById(id).orElse(null);
    }
}
