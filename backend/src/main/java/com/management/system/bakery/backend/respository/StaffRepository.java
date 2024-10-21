package com.management.system.bakery.backend.respository;

import com.management.system.bakery.backend.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {
Optional<Staff> findByName(String name);
}
