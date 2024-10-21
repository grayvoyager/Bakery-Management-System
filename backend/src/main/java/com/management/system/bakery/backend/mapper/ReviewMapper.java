package com.management.system.bakery.backend.mapper;

import com.management.system.bakery.backend.DTO.ReviewDTO;
import com.management.system.bakery.backend.entity.Review;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {UserMapper.class, FoodItemMapper.class})
public interface ReviewMapper {

    @Mapping(source = "user", target = "user")
    @Mapping(source = "foodItem", target = "foodItem")
    ReviewDTO toDto(Review review);

    @Mapping(source = "user", target = "user")
    @Mapping(source = "foodItem", target = "foodItem")
    Review toEntity(ReviewDTO reviewDTO);
}
