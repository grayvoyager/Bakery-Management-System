package com.management.system.bakery.backend.service;

import com.management.system.bakery.backend.entity.FoodItem;

import java.util.List;

public interface FoodItemService {
    FoodItem createFoodItem(FoodItem foodItem);
    void deleteFoodItem(String name);
    FoodItem updateFoodItem(FoodItem foodItem, String name);
    FoodItem findByName(String name);
    List<FoodItem> getAllItems();

}
