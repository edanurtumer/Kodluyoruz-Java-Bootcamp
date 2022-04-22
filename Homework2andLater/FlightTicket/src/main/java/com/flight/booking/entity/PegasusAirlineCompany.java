package com.flight.booking.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Pegasus")
@Data
public class PegasusAirlineCompany extends AirlineCompany implements IAbroadFoodChooise{

    public PegasusAirlineCompany() {
        super();
    }

    @Override
    public AirlineCompany buildAirlineCompany(String name, AirlineCompany airlineCompany) {
        airlineCompany.setName(name);
        return airlineCompany;
    }

    @Override
    public void foodChoise() {
        System.out.println("Pegasus serves chicken meals.");
    }
}
