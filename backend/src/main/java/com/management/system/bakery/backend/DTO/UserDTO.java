package com.management.system.bakery.backend.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO {
    private Long id;
    private String userName;
    private String email;
    private String phoneNumber;
    private RoleDTO role;
}
