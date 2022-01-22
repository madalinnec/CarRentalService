package com.project.carrentalservice.domain;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Revenue {

    @Id
    private int id;

    @Column
    private String date;

    @Column
    private double amount;
}