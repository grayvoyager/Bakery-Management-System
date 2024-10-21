package com.management.system.bakery.backend.mapper;

import com.management.system.bakery.backend.DTO.BillDTO;
import com.management.system.bakery.backend.entity.Bill;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {UserMapper.class, OrderMapper.class, DiningTablesMapper.class})
public interface BillMapper {

    @Mapping(source = "user", target = "user")
    @Mapping(source = "order", target = "order")
    @Mapping(source = "table", target = "table")
    BillDTO toDto(Bill bill);

    @Mapping(source = "user", target = "user")
    @Mapping(source = "order", target = "order")
    @Mapping(source = "table", target = "table")
    Bill toEntity(BillDTO billDTO);
}
