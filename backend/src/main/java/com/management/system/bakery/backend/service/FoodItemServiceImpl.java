package com.management.system.bakery.backend.service;

import com.management.system.bakery.backend.entity.FoodItem;
import com.management.system.bakery.backend.exceptions.EntityNotFoundException;
import com.management.system.bakery.backend.respository.FoodItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodItemServiceImpl implements FoodItemService{
    private FoodItemRepository foodItemRepository;
    @Override
    public FoodItem createFoodItem(FoodItem foodItem) {
        foodItemRepository.save(foodItem);
        return foodItem;
    }

    @Override
    public void deleteFoodItem(String name) {
        foodItemRepository.findByName(name)
                .orElseThrow(()->new EntityNotFoundException("The food item couldn't be found."));
        foodItemRepository.deleteByName(name);

    }

    @Override
    public FoodItem updateFoodItem(FoodItem updatedfoodItem, String fooditemname) {
        FoodItem existingfooditem = foodItemRepository.findByName(fooditemname)
                .orElseThrow(()->new EntityNotFoundException("No such food item exists."));
        existingfooditem.setName(updatedfoodItem.getName());
        existingfooditem.setFoodPrice(updatedfoodItem.getFoodPrice());
        return foodItemRepository.save(existingfooditem);
    }

    @Override
    public FoodItem findByName(String fooditemname) {
        return foodItemRepository.findByName(fooditemname)
                .orElseThrow(()->new EntityNotFoundException("No such food item exists."));
    }

    @Override
    public List<FoodItem> getAllItems() {
        return foodItemRepository.findAll();
    }
}
