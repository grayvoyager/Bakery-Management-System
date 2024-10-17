package com.management.system.bakery.backend.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
public class OrderDTO {
    private Long orderId;
    private FoodItemDTO foodItem;
    private Integer quantity;
    private UserDTO user;
    private TableReservationStatusDTO table;
    private Double orderAmount;
    private Timestamp createdAt;
}
