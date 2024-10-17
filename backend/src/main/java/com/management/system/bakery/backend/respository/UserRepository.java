package com.management.system.bakery.backend.respository;

import com.management.system.bakery.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Additional query methods can be defined here
    User findByName(String email);
}

