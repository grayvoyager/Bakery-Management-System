package com.management.system.bakery.backend.mapper;

import com.management.system.bakery.backend.DTO.RoleDTO;
import com.management.system.bakery.backend.entity.Role;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleDTO toDto(Role role);

    Role toEntity(RoleDTO roleDTO);
}
