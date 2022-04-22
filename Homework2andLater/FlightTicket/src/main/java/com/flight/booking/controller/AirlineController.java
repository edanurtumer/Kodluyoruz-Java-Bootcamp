package com.flight.booking.controller;

import com.flight.booking.dto.GenericDTO;
import com.flight.booking.entity.AirlineCompany;
import com.flight.booking.service.AirlineCompanyService;
import com.flight.booking.utils.MapperUtils;
import com.flight.booking.utils.OperationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/airline")
public class AirlineController {

    @Autowired
    AirlineCompanyService airlineCompanyService;

    @GetMapping(value = "/search/{name}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public GenericDTO searchAirline(@PathVariable String name) {
        return airlineCompanyService.searchAirline(name);
    }
}