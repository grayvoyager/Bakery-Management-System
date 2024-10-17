package com.management.system.bakery.backend.respository;

import com.management.system.bakery.backend.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {
    // Additional query methods can be defined here
}
