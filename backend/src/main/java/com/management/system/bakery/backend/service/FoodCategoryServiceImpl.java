package com.management.system.bakery.backend.service;

import com.management.system.bakery.backend.entity.FoodCategory;
import com.management.system.bakery.backend.entity.FoodItem;
import com.management.system.bakery.backend.exceptions.EntityNotFoundException;
import com.management.system.bakery.backend.respository.FoodCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodCategoryServiceImpl implements FoodCategoryService{
    private FoodCategoryRepository foodCategoryRepository;

    @Override
    public void deleteByName(String name) {
        foodCategoryRepository.findByName(name)
                .orElseThrow(()->new EntityNotFoundException("No such category exists!!"));
        foodCategoryRepository.deleteByName(name);
    }

    @Override
    public FoodCategory updateFoodCategory(FoodCategory updatedFoodCategory, String foodCategoryname) {
        FoodCategory existingCategory= foodCategoryRepository.findByName(foodCategoryname)
                .orElseThrow(()->new EntityNotFoundException("No such category exists!!"));
        existingCategory.setName(updatedFoodCategory.getName());
        existingCategory.setFoodItems(updatedFoodCategory.getFoodItems());
        return foodCategoryRepository.save(existingCategory);

    }

    @Override
    public FoodCategory getById(Long id) {
        return foodCategoryRepository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("No such category exits!!"));
    }

    @Override
    public FoodCategory findByName(String foodcategoryname) {
        return foodCategoryRepository.findByName(foodcategoryname)
                .orElseThrow(()-> new EntityNotFoundException("No such category exits!!"));
    }

    @Override
    public List<FoodCategory> getAllFoodCategories() {
        return foodCategoryRepository.findAll();
    }

    @Override
    public FoodCategory createFoodCategoryWithItems(FoodCategory foodCategory, List<FoodItem> foodItems) {
        for (FoodItem foodItem : foodItems) {
            foodItem.setFoodCategory(foodCategory);
        }
        foodCategory.setFoodItems(foodItems);
        FoodCategory savedFoodCategory = foodCategoryRepository.save(foodCategory);
        return savedFoodCategory;

    }
}
