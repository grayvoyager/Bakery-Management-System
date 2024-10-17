package com.management.system.bakery.backend.DTO;

import lombok.Data;

@Data
public class RoleDTO {
    private Long id;
    private String roleType; // e.g., Admin, Customer
}
