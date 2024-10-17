package com.management.system.bakery.backend.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MenuDTO {
//    private Long menuId;
    private FoodCategoryDTO foodCategory;
    private FoodItemDTO foodItem;
}
