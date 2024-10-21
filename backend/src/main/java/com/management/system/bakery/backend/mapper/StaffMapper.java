package com.management.system.bakery.backend.mapper;

import com.management.system.bakery.backend.DTO.StaffDTO;
import com.management.system.bakery.backend.DTO.UserDTO;
import com.management.system.bakery.backend.entity.Staff;
import org.mapstruct.Mapper;

@Mapper
public interface StaffMapper {
    StaffDTO toDto(Staff staff);
    Staff toEntity(UserDTO userDTO);
}
