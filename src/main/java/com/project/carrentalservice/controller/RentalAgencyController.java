package com.project.carrentalservice.controller;

import com.project.carrentalservice.domain.RentalAgency;
import com.project.carrentalservice.exception.EntityNotFoundException;
import com.project.carrentalservice.service.RentalAgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RentalAgencyController {

    private final RentalAgencyService rentalAgencyService;

    @Autowired
    public RentalAgencyController(RentalAgencyService rentalAgencyService){
        this.rentalAgencyService = rentalAgencyService;
    }

    @GetMapping("/rentalAgency")
    public List<RentalAgency> getRentalAgenciesList(){
        return rentalAgencyService.returnRentalAgencies();
    }

    @PostMapping("/rentalAgency")
    public void createRentalAgency(@RequestBody RentalAgency rentalAgency){ //RequestBody - used when we want to send a json file to the database
        rentalAgencyService.createRentalAgency(rentalAgency);
    }

    @GetMapping("/rentalAgency/{id}")
    public RentalAgency getRentalAgencyById(@PathVariable int id){//PathVariable - takes the id we provide
        try{
            return rentalAgencyService.returnRentalAgencyById(id);
        }catch(EntityNotFoundException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @DeleteMapping("/rentalAgency/{id}")
    public void deleteRentalAgencyById(@PathVariable int id){
        rentalAgencyService.deleteRentalAgency(id);
    }

}
