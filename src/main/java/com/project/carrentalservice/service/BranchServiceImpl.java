package com.project.carrentalservice.service;

import com.project.carrentalservice.domain.Branch;
import com.project.carrentalservice.domain.RentalAgency;
import com.project.carrentalservice.exception.EntityNotFoundException;
import com.project.carrentalservice.repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BranchServiceImpl implements BranchService{

    private final BranchRepository branchRepository;

    @Autowired
    public BranchServiceImpl(BranchRepository branchRepository){
        this.branchRepository = branchRepository;
    }

    @Override
    public void createBranch(Branch branch) {
        branchRepository.save(branch);
    }

    @Override
    public Branch getBranchById(int id) throws EntityNotFoundException {
        Optional<Branch> optional = branchRepository.findById(id);
        if(optional.isPresent()){
            return optional.get();
        }
        throw new EntityNotFoundException(String.format("The object with id %s doesn't exist in the database", id));
    }

    @Override
    public List<Branch> getAllBranches() {
        return branchRepository.findAll();
    }

    @Override
    public void deleteBranchById(int id) {
        branchRepository.deleteById(id);
    }

    @Override
    public RentalAgency getRentalAgencyByBranchId(int id) {
        return branchRepository.getRentalAgencyById(id);
    }
}
