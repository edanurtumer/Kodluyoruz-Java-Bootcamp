package com.flight.booking.entity;

import com.flight.booking.service.AirlineCompanyService;
import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("THY")
@Data
public abstract class THYAirlineCompany extends AirlineCompany implements IAbroadFoodChooise {

    public THYAirlineCompany() {
        super();
    }

    @Override
    public AirlineCompany buildAirlineCompany(String name, AirlineCompany airlineCompany) {
        airlineCompany.setName(name);
        return airlineCompany;
    }

    @Override
    public void foodChoise() {
        System.out.println("THY serves sandwich meals.");
    }

}
