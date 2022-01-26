package com.project.carrentalservice.controller;

import com.project.carrentalservice.domain.Branch;
import com.project.carrentalservice.exception.EntityNotFoundException;
import com.project.carrentalservice.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/branch")
public class BranchController {

    private final BranchService branchService;

    @Autowired
    public BranchController(BranchService branchService) {
        this.branchService = branchService;
    }

    @GetMapping("/get/{id}")
    public Branch getBranchById(@PathVariable int id) throws EntityNotFoundException {
        return branchService.getBranchById(id);
    }

    @GetMapping("/all")
    public List<Branch> getAllBranches(){
        return branchService.getAllBranches();
    }

    @PostMapping("/create")
    public void createBranch(@RequestBody Branch branch){
        branchService.createBranch(branch);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBranchById(@PathVariable int id){
        branchService.deleteBranchById(id);
    }
}
