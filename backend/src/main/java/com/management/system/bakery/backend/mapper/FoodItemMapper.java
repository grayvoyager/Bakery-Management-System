package com.management.system.bakery.backend.mapper;
import com.management.system.bakery.backend.DTO.FoodItemDTO;
import com.management.system.bakery.backend.entity.FoodItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {FoodCategoryMapper.class})
public interface FoodItemMapper {

    @Mapping(source = "foodCategory", target = "foodCategory")
    FoodItemDTO toDto(FoodItem foodItem);

    @Mapping(source = "foodCategory", target = "foodCategory")
    FoodItem toEntity(FoodItemDTO foodItemDTO);
}
