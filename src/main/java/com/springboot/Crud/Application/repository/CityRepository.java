package com.springboot.Crud.Application.repository;

import com.springboot.Crud.Application.Model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.beans.JavaBean;
import java.util.UUID;

@Repository
public interface CityRepository extends JpaRepository<City, UUID> {
}
