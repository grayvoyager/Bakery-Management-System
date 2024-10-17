package com.management.system.bakery.backend.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class AdminUserDTO extends UserDTO {
    private List<StaffDTO> managedStaff;
    private List<ReservationRequestDTO> reservationRequests;
}
