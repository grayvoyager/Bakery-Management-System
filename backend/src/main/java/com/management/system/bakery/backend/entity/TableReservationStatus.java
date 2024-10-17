package com.management.system.bakery.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "table_reservation_status")
public class TableReservationStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tableId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "table_capacity", nullable = false)
    private Integer tableCapacity;

    @Column(name = "status", nullable = false)
    private String status; // Consider using an enum for predefined statuses
}
