package com.project.carrentalservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Reservation {

    @Id
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_customer")
    private Customer idCustomer;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_car")
    private Car idCar;

    @Column(name = "booking_date")
    private String bookingDate;

    @Column(name = "date_start")
    private String dateStart;

    @Column(name = "date_stop")
    private String dateStop;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_branch")
    private Branch idBranch;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_return_branch")
    private Branch idReturnBranch;

    @Column
    private double price;

}
