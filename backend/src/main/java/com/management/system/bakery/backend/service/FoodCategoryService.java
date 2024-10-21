package com.management.system.bakery.backend.service;

import com.management.system.bakery.backend.entity.FoodCategory;
import com.management.system.bakery.backend.entity.FoodItem;

import java.util.List;

public interface FoodCategoryService {
    void deleteByName(String name);
    FoodCategory updateFoodCategory(FoodCategory foodCategory, String foodCategoryname);
    FoodCategory getById(Long id);
    FoodCategory findByName(String name);
    List<FoodCategory> getAllFoodCategories();
    FoodCategory createFoodCategoryWithItems(FoodCategory foodCategory, List<FoodItem> foodItems);

}
