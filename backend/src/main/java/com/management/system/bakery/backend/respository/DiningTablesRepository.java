package com.management.system.bakery.backend.respository;

import com.management.system.bakery.backend.entity.DiningTables;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DiningTablesRepository extends JpaRepository<DiningTables, Long>
{
    Optional <DiningTables> findByName(String name);
    List<DiningTables> findByStatus(String status);
}