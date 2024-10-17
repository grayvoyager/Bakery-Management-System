package com.management.system.bakery.backend.DTO;

import lombok.Data;

@Data
public class CustomerUserDTO extends UserDTO {
    private List<ReviewDTO> reviews;
    private List<ReservationRequestDTO> reservationRequests;
}
