package com.project.carrentalservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

//@Data //contine settere, gettere, toString, equals, hashCode
@Data
@Entity
public class Branch {

    @Id
    private int id;

    @Column
    private String address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rental_agency")
    @JsonIgnoreProperties(value = {"branches", "handler","hibernateLazyInitializer"}, allowSetters = true)
    //@JsonIgnoreProperties - ignores the property "branches" in rentalAgency to avoid an infinite loop
    private RentalAgency rentalAgency;

    @OneToMany(mappedBy = "branch", fetch = FetchType.LAZY) //add mappedBy in other entities for OneToMany
    @JsonIgnoreProperties(value = {"idBranch", "handler","hibernateLazyInitializer"}, allowSetters = true)
    private List<Employee> employees;

    @OneToMany(mappedBy = "branch", fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = {"branch", "handler","hibernateLazyInitializer"}, allowSetters = true)
    private List<Car> cars;

    @OneToMany(mappedBy = "branch", fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = {"branch", "handler","hibernateLazyInitializer"}, allowSetters = true)
    private List<Reservation> reservations;
}