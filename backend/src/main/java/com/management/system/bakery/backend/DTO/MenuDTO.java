package com.management.system.bakery.backend.DTO;

import lombok.Data;

@Data
public class MenuDTO {
    private Long menuId;
    private FoodCategoryDTO foodCategory;
    private FoodItemDTO foodItem;
}
