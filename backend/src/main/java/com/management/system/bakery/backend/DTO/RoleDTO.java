package com.management.system.bakery.backend.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RoleDTO {
    private Long id;
    private String roleType; // e.g., Admin, Customer
}
