package com.tdd.pratices._5dip.violation;

public class VehicleRental {

    public Long rent(Vehicle vehicle,String email){
        Long idTransaction =1L;
        vehicle.setDisposable(false);
        EmailService emailService = new EmailService();
        emailService.send(email,String.format("Vehicle id: % rented",vehicle.getId()));
        return idTransaction;
    }
}
