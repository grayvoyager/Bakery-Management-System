package com.management.system.bakery.backend.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StaffDTO {
    private Long id;
    private String staffName;
    private String shift;
    private String designation;
}
