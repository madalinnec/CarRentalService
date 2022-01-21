package com.project.carrentalservice.repository;

import com.project.carrentalservice.domain.Branch;
import com.project.carrentalservice.domain.RentalAgency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer> {

    @Query(value = "select r from rental_agency r where r.id = :id")
    RentalAgency getRentalAgencyById(@Param("id") int id); //let Spring know that id is the parameter in the query above.

}
