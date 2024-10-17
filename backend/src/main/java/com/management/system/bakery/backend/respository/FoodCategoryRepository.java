package com.management.system.bakery.backend.respository;

import com.management.system.bakery.backend.entity.FoodCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodCategoryRepository extends JpaRepository<FoodCategory, Long> {
    // Additional query methods can be defined here
}
