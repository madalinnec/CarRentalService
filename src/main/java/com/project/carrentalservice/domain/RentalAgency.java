package com.project.carrentalservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "rental_agency")
public class RentalAgency {

    @Id
    private int id;

    @Column
    private String name;

    @Column(name = "internet_domain")
    private String internetDomain;

    @Column(name = "contact_address")
    private String contactAddress;

    @Column
    private String owner;

    @OneToMany(mappedBy = "rentalAgency")
    @JsonIgnore
    private List<Branch> branches;
}
