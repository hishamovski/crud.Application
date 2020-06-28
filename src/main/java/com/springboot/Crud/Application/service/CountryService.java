package com.springboot.Crud.Application.service;

import com.springboot.Crud.Application.Model.Country;
import com.springboot.Crud.Application.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Country addCountry(Country country){
        return countryRepository.save(country);
    }

    public String deleteById(UUID id){
        if (this.getById(id) != null){
            countryRepository.deleteById(id);
            return "" + id + " deleted";
        } else {
            return "not found to delete";
        }
    }

    public List<Country> findAll(){
        return countryRepository.findAll();
    }

    public Country getById(UUID id){
        return countryRepository.findById(id).orElse(null);
    }
}
