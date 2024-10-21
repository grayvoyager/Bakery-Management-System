package com.management.system.bakery.backend.respository;

import com.management.system.bakery.backend.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    // Additional query methods can be defined here
}

