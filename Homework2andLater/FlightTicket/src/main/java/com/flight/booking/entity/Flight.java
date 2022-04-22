package com.flight.booking.entity;

import lombok.*;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.*;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.TypeVariable;
import java.util.List;

@Entity
@Table(name = "FLIGHT")

public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private static int id;

    @Column(name = "CODE")
    private String code;

    @ManyToOne
    private AirlineCompany airlineCompany;

    @Column(name = "QUOTA")
    private int quota;

    @Column(name = "CURRENT_ATTENDANCE_NUMBER")
    private int currentAttendanceNumber;

    @OneToMany
    private List<Ticket> tickets;

    @ManyToOne
    private Route route;

    public Flight() {
    }

    public static Flight buildFlight(String code,
                                     int quota,
                                     AirlineCompany airlineCompany,
                                     Route route) {

        Flight flight = new Flight();
        flight.setCode(code);
        flight.setQuota(quota);
        flight.setCurrentAttendanceNumber(0);
        flight.setAirlineCompany(airlineCompany);
        flight.setRoute(route);
        return flight;
    }

}
