package com.management.system.bakery.backend.service;

import com.management.system.bakery.backend.entity.FoodCategory;
import com.management.system.bakery.backend.entity.Menu;
import com.management.system.bakery.backend.exceptions.EntityNotFoundException;
import com.management.system.bakery.backend.respository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService{
    private MenuRepository menuRepository;

    @Override
    public Menu createMenu(List<FoodCategory> foodCategoryList) {
        return null;
    }

    @Override
    public void deleteMenu(Long id) {
        menuRepository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("Menu not found"));
        menuRepository.deleteById(id);
    }

    @Override
    public Menu updateMenu(List<FoodCategory> foodCategoryList, Long id) {
        return null;
    }


    @Override
    public Menu getMenubyId(Long id) {
        return menuRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("No such menu exists."));
    }

    @Override
    public Optional<Menu> getAllMenuCategories(Long id) {
//        return menuRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("No such menu exists."));
        return null;
    }
}
