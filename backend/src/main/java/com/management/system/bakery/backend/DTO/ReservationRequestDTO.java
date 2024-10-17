package com.management.system.bakery.backend.DTO;

import lombok.Data;

@Data
public class ReservationRequestDTO {
    private Long reservationId;
    private UserDTO user; // User requesting the reservation
    private Integer capacity;
    private String status; // e.g., Approved, Rejected, Pending
}
