package com.management.system.bakery.backend.mapper;

import com.management.system.bakery.backend.DTO.DiningTablesDTO;
import com.management.system.bakery.backend.entity.DiningTables;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface DiningTablesMapper {

    @Mapping(source = "user", target = "user")
    DiningTablesDTO toDto(DiningTables diningTable);

    @Mapping(source = "user", target = "user")
    DiningTables toEntity(DiningTablesDTO diningTableDTO);
}
