package com.management.system.bakery.backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Tables;

import java.sql.Timestamp;

@Data
@Entity
@NoArgsConstructor
@jakarta.persistence.Table(name = "bills")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @OneToOne
    @JoinColumn(name = "table_id", nullable = false)
    private DiningTables table;

    @Column(name = "bill_amount", nullable = false)
    private Double billAmount;

    @Column(name = "bill_date", nullable = false)
    private Timestamp billDate;

    @Column(name = "bill_status", nullable = false) // Consider using an enum for "paid/unpaid"
    private String billStatus;
}
