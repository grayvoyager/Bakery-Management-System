package com.management.system.bakery.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "bills")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long billId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "table_id", nullable = false)
    private TableEntity table;

    @Column(name = "bill_amount", nullable = false)
    private Double billAmount;

    @Column(name = "bill_date", nullable = false)
    private Timestamp billDate;

    @Column(name = "bill_status", nullable = false) // Consider using an enum for "paid/unpaid"
    private String billStatus;
}
