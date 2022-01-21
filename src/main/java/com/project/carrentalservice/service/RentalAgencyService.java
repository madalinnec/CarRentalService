package com.project.carrentalservice.service;

import com.project.carrentalservice.domain.RentalAgency;
import com.project.carrentalservice.exception.EntityNotFoundException;

import java.util.List;

public interface RentalAgencyService {

    void createRentalAgency(RentalAgency rentalAgency);

    void deleteRentalAgency(int id);

    List<RentalAgency> returnRentalAgencies();

    RentalAgency returnRentalAgencyById(int id) throws EntityNotFoundException;
}
