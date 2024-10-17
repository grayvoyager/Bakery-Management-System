package com.management.system.bakery.backend.DTO;

import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String userName;
    private String email;
    private String phoneNumber;
    private RoleDTO role;
}
