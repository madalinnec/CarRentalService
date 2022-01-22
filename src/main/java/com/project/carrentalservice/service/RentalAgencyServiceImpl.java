package com.project.carrentalservice.service;

import com.project.carrentalservice.domain.RentalAgency;
import com.project.carrentalservice.exception.EntityNotFoundException;
import com.project.carrentalservice.repository.RentalAgencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RentalAgencyServiceImpl implements RentalAgencyService{

//    @Autowired //field injection - brings the RentalAgencyRepository in RentalAgencyServiceImpl
    //not used often because it's hard to test it

    private final RentalAgencyRepository rentalAgencyRepository; //final only when used for the constructor method

    @Autowired //autowired is added automatically when using dependency injection on a constructor
    public RentalAgencyServiceImpl(RentalAgencyRepository rentalAgencyRepository) {
        this.rentalAgencyRepository = rentalAgencyRepository;
    }

//    @Autowired //dependency injection using a setter
//    public void setRentalAgencyRepository(RentalAgencyRepository rentalAgencyRepository){
//        this.rentalAgencyRepository = rentalAgencyRepository;
//    }


    @Override
    public void createRentalAgency(RentalAgency rentalAgency) {
        rentalAgencyRepository.save(rentalAgency);
    }

    @Override
    public void deleteRentalAgency(int id) {
        rentalAgencyRepository.deleteById(id);
    }

    @Override
    public List<RentalAgency> returnRentalAgencies() {
        return rentalAgencyRepository.findAll();
    }

    @Override
    public RentalAgency returnRentalAgencyById(int id) throws EntityNotFoundException {
        Optional<RentalAgency> rentalAgency = rentalAgencyRepository.findById(id);
        if(rentalAgency.isPresent()){
            return rentalAgency.get();
        }
        throw new EntityNotFoundException(String.format("The object with id %s doesn't exist in the database", id));
    }
}
