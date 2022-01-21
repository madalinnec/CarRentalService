package com.project.carrentalservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Employee {

    @Id
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column
    private String position;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_branch")
    private Branch idBranch;

}
