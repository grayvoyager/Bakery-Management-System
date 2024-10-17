package com.management.system.bakery.backend.respository;

import com.management.system.bakery.backend.entity.ReservationRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRequestRepository extends JpaRepository<ReservationRequest, Long> {
    // Additional query methods can be defined here
}
