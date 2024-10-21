package com.management.system.bakery.backend.mapper;

import com.management.system.bakery.backend.DTO.AdminUserDTO;
import com.management.system.bakery.backend.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {StaffMapper.class, ReservationRequestMapper.class})
public interface AdminUserMapper {

    // Map User entity to AdminUserDTO
    @Mappings({
            @Mapping(source = "managedStaff", target = "managedStaff"),
            @Mapping(source = "reservationRequests", target = "reservationRequests")
    })
    AdminUserDTO toAdminUserDTO(User user);

    // Map AdminUserDTO back to User entity
    @Mappings({
            @Mapping(target = "role", ignore = true) // Ignore role here and handle in service layer
    })
    User toAdminUser(AdminUserDTO adminUserDTO);
}

