package com.tdd.pratices._5dip.solution;

import com.tdd.pratices._5dip.violation.Vehicle;

public class VehicleRental {

    private EmailService emailService;

    public VehicleRental(EmailService emailService) {
        this.emailService = emailService;
    }

    public Long rent(Vehicle vehicle, String email){
        Long idTransaction =1L;
        vehicle.setDisposable(false);
        emailService.send(email,String.format("Vehicle id: % rented",vehicle.getId()));
        return idTransaction;
    }
}
