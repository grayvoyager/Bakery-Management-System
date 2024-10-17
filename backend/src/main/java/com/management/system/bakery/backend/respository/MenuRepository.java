package com.management.system.bakery.backend.respository;

import com.management.system.bakery.backend.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    // Additional query methods can be defined here
}
