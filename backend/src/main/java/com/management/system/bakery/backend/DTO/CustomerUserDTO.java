package com.management.system.bakery.backend.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class CustomerUserDTO extends UserDTO {
    private List<ReviewDTO> reviews;
    private List<ReservationRequestDTO> reservationRequests;
}
