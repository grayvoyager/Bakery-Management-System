package com.management.system.bakery.backend.respository;

import com.management.system.bakery.backend.entity.TableReservationStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableReservationStatusRepository extends JpaRepository<TableReservationStatus, Long>
{
    // Additional query methods can be defined here
}