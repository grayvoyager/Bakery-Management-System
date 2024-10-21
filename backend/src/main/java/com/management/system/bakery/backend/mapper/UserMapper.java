package com.management.system.bakery.backend.mapper;

import com.management.system.bakery.backend.DTO.UserDTO;
import com.management.system.bakery.backend.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    UserDTO toDto(User user);
    User toEntity(UserDTO userDTO);
}
