package com.management.system.bakery.backend.DTO;

import lombok.Data;
import java.util.List;

@Data
public class AdminUserDTO extends UserDTO {
    private List<StaffDTO> managedStaff;
    private List<ReservationRequestDTO> reservationRequests;
}
