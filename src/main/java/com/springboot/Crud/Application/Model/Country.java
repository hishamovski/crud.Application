package com.springboot.Crud.Application.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Country {
    @Id
    @GeneratedValue
    private UUID countryId;
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id", referencedColumnName = "countryId")
    private List <City> cities;
}
