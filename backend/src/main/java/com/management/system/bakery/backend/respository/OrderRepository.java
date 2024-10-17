package com.management.system.bakery.backend.respository;

import com.management.system.bakery.backend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // Additional query methods can be defined here
}

