package com.project.carrentalservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

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
    @JsonIgnoreProperties(value = {"employees", "handler","hibernateLazyInitializer"}, allowSetters = true)
    private Branch branch;

    @OneToMany(mappedBy = "employee",fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = {"employee", "handler","hibernateLazyInitializer"}, allowSetters = true)
    private List<Rental> rentals;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = {"employee", "handler","hibernateLazyInitializer"}, allowSetters = true)
    private List<Return> returns;
}
