package com.management.system.bakery.backend.service;

import com.management.system.bakery.backend.entity.FoodCategory;
import com.management.system.bakery.backend.entity.Menu;

import java.util.List;
import java.util.Optional;

public interface MenuService {
   Menu createMenu(List<FoodCategory> foodCategoryList);
   void deleteMenu(Long id);
   Menu updateMenu(List<FoodCategory> foodCategoryList, Long id);
   Menu getMenubyId(Long id);
   Optional<Menu> getAllMenuCategories(Long id);
//   List<FoodCategory> getAllFoodCategories();

}
