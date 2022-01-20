package com.project.carrentalservice.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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

}
