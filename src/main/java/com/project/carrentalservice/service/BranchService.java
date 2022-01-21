package com.project.carrentalservice.service;

import com.project.carrentalservice.domain.Branch;
import com.project.carrentalservice.domain.RentalAgency;
import com.project.carrentalservice.exception.EntityNotFoundException;

import java.util.List;

public interface BranchService {

    void createBranch(Branch branch);

    Branch getBranchById(int id) throws EntityNotFoundException;

    List<Branch> getAllBranches();

    void deleteBranchById(int id);

    RentalAgency getRentalAgencyByBranchId(int id);

}
