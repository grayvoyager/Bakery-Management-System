package com.management.system.bakery.backend.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class FoodCategoryDTO {
//   private Long foodCategoryId;
    private String categoryName;
    private List<FoodItemDTO> foodItems; // Include items for the category
}
