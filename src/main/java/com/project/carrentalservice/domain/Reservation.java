package com.project.carrentalservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Reservation {

    @Id
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = {"reservations", "handler","hibernateLazyInitializer"}, allowSetters = true)
    @JoinColumn(name = "id_customer")
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = {"reservations", "handler","hibernateLazyInitializer"}, allowSetters = true)
    @JoinColumn(name = "id_car")
    private Car idCar;

    @Column(name = "booking_date")
    private String bookingDate;

    @Column(name = "date_start")
    private String dateStart;

    @Column(name = "date_stop")
    private String dateStop;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = {"reservations", "handler","hibernateLazyInitializer"}, allowSetters = true)
    @JoinColumn(name = "id_branch")
    private Branch branch;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = {"reservations", "handler","hibernateLazyInitializer"}, allowSetters = true)
    @JoinColumn(name = "id_return_branch")
    private Branch returnBranch;

    @Column
    private double price;

    @OneToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = {"reservation", "handler","hibernateLazyInitializer"}, allowSetters = true)
    private Rental rental;

    @OneToOne
    @JsonIgnoreProperties(value = {"return", "handler","hibernateLazyInitializer"}, allowSetters = true)
    private Return returnCar;
}