package com.project.carrentalservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data //contine settere, gettere, toString, equals, hashCode
@Entity
public class Branch {

    @Id
    private int id;

    @Column
    private String address;

    @ManyToOne //(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rental_agency")
//    @JsonIgnore //ignores this from the json file when using GET
    private RentalAgency rentalAgency;

}
