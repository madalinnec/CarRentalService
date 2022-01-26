package com.project.carrentalservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Return {

    @Id
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = {"returns", "handler","hibernateLazyInitializer"}, allowSetters = true)
    @JoinColumn(name = "id_employee")
    private Employee employee;

    @Column(name = "return_date")
    private String returnDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = {"returnCar", "handler","hibernateLazyInitializer"}, allowSetters = true)
    @JoinColumn(name = "id_reservation")
    private Reservation idReservation;

    @Column
    private double surcharge;

    @Column
    private String comments;
}