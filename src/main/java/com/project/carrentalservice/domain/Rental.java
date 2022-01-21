package com.project.carrentalservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Rental {

    @Id
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_employee")
    private Employee idEmployee;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_reservation")
    private Reservation idReservation;

    @Column
    private String comments;
}
