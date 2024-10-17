package com.management.system.bakery.backend.respository;

import com.management.system.bakery.backend.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Long> {
    // Additional query methods can be defined here
}
