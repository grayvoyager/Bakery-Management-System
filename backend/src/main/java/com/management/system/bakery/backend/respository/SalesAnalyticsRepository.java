package com.management.system.bakery.backend.respository;

import com.management.system.bakery.backend.entity.SalesAnalytics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesAnalyticsRepository extends JpaRepository<SalesAnalytics, Long> {
    // Additional query methods can be defined here
}
