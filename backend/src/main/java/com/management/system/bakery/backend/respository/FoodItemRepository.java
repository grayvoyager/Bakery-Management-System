package com.management.system.bakery.backend.respository;

import com.management.system.bakery.backend.entity.FoodCategory;
import com.management.system.bakery.backend.entity.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
    Optional<FoodItem> findByName(String name);
    void deleteByName(String name);
}
