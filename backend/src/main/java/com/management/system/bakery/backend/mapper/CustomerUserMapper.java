package com.management.system.bakery.backend.mapper;

import com.management.system.bakery.backend.DTO.CustomerUserDTO;
import com.management.system.bakery.backend.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ReservationRequestMapper.class, RoleMapper.class})
public interface CustomerUserMapper {

    @Mappings({
            @Mapping(source = "reservationRequests", target = "reservationRequests"),
            @Mapping(source = "role", target = "role")
    })
    CustomerUserDTO toCustomerUserDTO(User user);

    @Mappings({
            @Mapping(source = "reservationRequests", target = "reservationRequests"),
            @Mapping(target = "role", ignore = true) // Role can be handled in the service layer if needed
    })
    User toCustomerUser(CustomerUserDTO customerUserDTO);
}
