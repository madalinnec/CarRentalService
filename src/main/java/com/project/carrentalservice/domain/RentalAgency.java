package com.project.carrentalservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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

    @OneToMany(mappedBy = "rentalAgency", cascade = CascadeType.ALL, fetch = FetchType.LAZY)//CascadeType.ALL - removes all the entries related to this,if this gets deleted
    @JsonIgnoreProperties(value = {"rentalAgency", "handler","hibernateLazyInitializer"}, allowSetters = true)
    private List<Branch> branches;
}