package com.management.system.bakery.backend.respository;

import com.management.system.bakery.backend.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {
    // Additional query methods can be defined here
    Optional<Bill> findByName(String name);

    // Find all bills by a specific user
    Optional<List<Bill>> findByUserId(Long userId);

    // Find all bills for a specific table
    Optional<List<Bill>> findByTableId(Long tableId);

    // Find all bills with a specific status (e.g., 'paid' or 'unpaid')
    Optional<List<Bill>> findByBillStatus(String billStatus);
}
