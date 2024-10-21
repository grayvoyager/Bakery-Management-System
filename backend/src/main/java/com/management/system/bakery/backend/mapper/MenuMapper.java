package com.management.system.bakery.backend.mapper;

import com.management.system.bakery.backend.DTO.MenuDTO;
import com.management.system.bakery.backend.entity.Menu;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {FoodItemMapper.class, FoodCategoryMapper.class})
public interface MenuMapper {

    @Mapping(source = "foodItem", target = "foodItem")
    @Mapping(source = "foodCategory", target = "foodCategory")
    MenuDTO toDto(Menu menu);

    @Mapping(source = "foodItem", target = "foodItem")
    @Mapping(source = "foodCategory", target = "foodCategory")
    Menu toEntity(MenuDTO menuDTO);
}
