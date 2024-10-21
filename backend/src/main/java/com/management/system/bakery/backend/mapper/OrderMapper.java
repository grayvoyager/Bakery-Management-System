package com.management.system.bakery.backend.mapper;

import com.management.system.bakery.backend.DTO.OrderDTO;
import com.management.system.bakery.backend.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {UserMapper.class, DiningTablesMapper.class, FoodItemMapper.class})
public interface OrderMapper {

    @Mapping(source = "user", target = "user")
    @Mapping(source = "table", target = "table")
    @Mapping(source = "foodItem", target = "foodItem")
    OrderDTO toDto(Order order);

    @Mapping(source = "user", target = "user")
    @Mapping(source = "table", target = "table")
    @Mapping(source = "foodItem", target = "foodItem")
    Order toEntity(OrderDTO orderDTO);
}
