package com.project.carrentalservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Return {

    @Id
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_employee")
    private Employee idEmployee;

    @Column(name = "return_date")
    private String returnDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_reservation")
    private Reservation idReservation;

    @Column
    private double surcharge;

    @Column
    private String comments;
}
