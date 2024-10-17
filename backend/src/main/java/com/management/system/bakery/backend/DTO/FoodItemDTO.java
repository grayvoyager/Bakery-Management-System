package com.management.system.bakery.backend.DTO;

import lombok.Data;

@Data
public class FoodItemDTO {
    private Long foodItemId;
    private String name; // Consider adding a name field
    private Double foodPrice;
    private FoodCategoryDTO foodCategory;
}
