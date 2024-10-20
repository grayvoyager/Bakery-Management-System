package com.management.system.bakery.backend.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "staff")
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "staff_name", nullable = false)
    private String staffName;

    @Column(name = "shift", nullable = false)
    private String shift;

    @Column(name = "designation", nullable = false)
    private String designation;
}
