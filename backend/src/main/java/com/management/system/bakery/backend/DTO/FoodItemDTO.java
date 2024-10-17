package com.management.system.bakery.backend.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FoodItemDTO {
//    private Long foodItemId;
    private String name; // Consider adding a name field
    private Double foodPrice;
    private FoodCategoryDTO foodCategory;
}
