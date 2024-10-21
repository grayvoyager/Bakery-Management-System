package com.management.system.bakery.backend.respository;

import com.management.system.bakery.backend.entity.ReservationRequest;
import com.management.system.bakery.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReservationRequestRepository extends JpaRepository<ReservationRequest, Long> {
Optional<ReservationRequest> findByName(String name);
}
