package com.project.carrentalservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data //contine settere, gettere, toString, equals, hashCode
@Entity
public class Branch {

    @Id
    private int id;

    @Column
    private String address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rental_agency")
    private RentalAgency idRentalAgency;

}
