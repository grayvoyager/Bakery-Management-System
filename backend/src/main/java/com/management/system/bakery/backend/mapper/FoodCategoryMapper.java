package com.management.system.bakery.backend.mapper;

import com.management.system.bakery.backend.DTO.FoodCategoryDTO;
import com.management.system.bakery.backend.entity.FoodCategory;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FoodCategoryMapper {

    FoodCategoryDTO toDto(FoodCategory foodCategory);

    FoodCategory toEntity(FoodCategoryDTO foodCategoryDTO);
}
