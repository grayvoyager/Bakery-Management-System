package com.management.system.bakery.backend.DTO;

import jdk.jfr.Timestamp;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SalesAnalyticsDTO {
    private Long id;
    private Timestamp date;
    private Double dailySales;
    private Double weeklySales;
    private Double monthlySales;
    private String bestsellingItems; // Consider a more structured approach if necessary
    private String slowMovingItems; // Consider a more structured approach if necessary
}
