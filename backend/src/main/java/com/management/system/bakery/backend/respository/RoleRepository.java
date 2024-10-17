package com.management.system.bakery.backend.respository;

import com.management.system.bakery.backend.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    // Additional query methods can be defined here
}
