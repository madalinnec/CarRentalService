package com.project.carrentalservice.repository;

import com.project.carrentalservice.domain.RentalAgency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalAgencyRepository extends JpaRepository<RentalAgency, Integer> {
}
