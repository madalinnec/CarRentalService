package com.project.carrentalservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Car {

    @Id
    @Column
    private int id;

    @Column
    private String brand;

    @Column
    private String model;

    @Column(name = "body_type")
    private String bodyType;

    @Column
    private String year;

    @Column
    private String colour;

    @Column
    private int mileage;

    @Column
    private String status;

    @Column
    private double amount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_branch")
    private Branch idBranch;
}
