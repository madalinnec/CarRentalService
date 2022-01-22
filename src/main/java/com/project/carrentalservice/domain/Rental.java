package com.project.carrentalservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Rental {

    @Id
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = {"rentals", "handler","hibernateLazyInitializer"}, allowSetters = true)
    @JoinColumn(name = "id_employee")
    private Employee idEmployee;

    @OneToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = {"rental", "handler","hibernateLazyInitializer"}, allowSetters = true)
    @JoinColumn(name = "id_reservation")
    private Reservation idReservation;

    @Column
    private String comments;
}