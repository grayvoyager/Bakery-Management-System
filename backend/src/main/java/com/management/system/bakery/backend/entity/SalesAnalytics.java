package com.management.system.bakery.backend.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.security.Timestamp;

@Data
@Entity
@Table(name = "sales_analytics")
public class SalesAnalytics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date", nullable = false)
    private Timestamp date;

    @Column(name = "daily_sales", nullable = false)
    private Double dailySales;

    @Column(name = "weekly_sales", nullable = false)
    private Double weeklySales;

    @Column(name = "monthly_sales", nullable = false)
    private Double monthlySales;

    @Column(name = "bestselling_items")
    private String bestsellingItems;

    @Column(name = "slow_moving_items")
    private String slowMovingItems;
}
