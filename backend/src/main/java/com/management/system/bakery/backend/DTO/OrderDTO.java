package com.management.system.bakery.backend.DTO;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class OrderDTO {
    private Long orderId;
    private FoodItemDTO foodItem;
    private Integer quantity;
    private UserDTO user;
    private TableReservationStatusDTO table;
    private Double orderAmount;
    private Timestamp createdAt;
}
