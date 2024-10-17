package com.management.system.bakery.backend.respository;

import com.management.system.bakery.backend.entity.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
    // Additional query methods can be defined here
}
