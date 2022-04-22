package com.flight.booking.exception;

public class LandingDateEarlierThanDepartureDateException {
    public LandingDateEarlierThanDepartureDateException(String message) {
        super(message);
    }

    public static LandingDateEarlierThanDepartureDateException buildException() {

        return new LandingDateEarlierThanDepartureDateException(ExceptionMessages.LANDING_DEPARTURE_DATE_CONTROL.getMessage());
    }
}
