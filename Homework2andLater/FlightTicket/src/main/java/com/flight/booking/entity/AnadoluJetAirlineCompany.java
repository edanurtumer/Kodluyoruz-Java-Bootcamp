package com.flight.booking.entity;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("AnadoluJet")
@Data
public class AnadoluJetAirlineCompany extends AirlineCompany implements IAbroadFoodChooise{

    public AnadoluJetAirlineCompany() {
        super();
    }

    @Override
    public AirlineCompany buildAirlineCompany(String name, AirlineCompany airlineCompany) {
        airlineCompany.setName(name);
        return airlineCompany;
    }

    @Override
    public void foodChoise() {
        System.out.println("AnadoluJet serves meat meals.");
    }
}
