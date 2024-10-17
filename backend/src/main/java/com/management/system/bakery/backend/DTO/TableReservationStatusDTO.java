package com.management.system.bakery.backend.DTO;

import lombok.Data;

@Data
public class TableReservationStatusDTO {
    private Long tableId;
    private UserDTO user; // Currently assigned user
    private Integer tableCapacity;
    private String status; // e.g., Available, Reserved
}
